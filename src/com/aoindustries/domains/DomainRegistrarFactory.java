/*
 * Copyright 2009-2012 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
package com.aoindustries.domains;

import com.aoindustries.lang.ObjectUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Creates instances of <code>DomainRegistrar</code>s based on the provided
 * parameters.
 * Will only create once instance of each unique set of parameters.
 *
 * @author  AO Industries, Inc.
 */
public class DomainRegistrarFactory {

    private static class ProviderKey {

        final private String providerId;
        final private String className;
        final private String param1;
        final private String param2;
        final private String param3;
        final private String param4;
        
        private ProviderKey(
            String providerId,
            String className,
            String param1,
            String param2,
            String param3,
            String param4
        ) {
            this.providerId = providerId;
            this.className = className;
            this.param1 = param1;
            this.param2 = param2;
            this.param3 = param3;
            this.param4 = param4;
        }
        
        @Override
        public int hashCode() {
            return
                providerId.hashCode()
                + className.hashCode()*7
                + (param1==null ? 0 : (param1.hashCode()*17))
                + (param2==null ? 0 : (param1.hashCode()*37))
                + (param3==null ? 0 : (param1.hashCode()*103))
                + (param4==null ? 0 : (param1.hashCode()*149))
            ;
        }
        
        @Override
        public boolean equals(Object O) {
            if(O==null) return false;
            if(!(O instanceof ProviderKey)) return false;
            ProviderKey other = (ProviderKey)O;
            return
                providerId.equals(other.providerId)
                && className.equals(other.className)
                && ObjectUtils.equals(param1, other.param1)
                && ObjectUtils.equals(param2, other.param2)
                && ObjectUtils.equals(param3, other.param3)
                && ObjectUtils.equals(param4, other.param4)
            ;
        }
    }

    final private static Map<ProviderKey,DomainRegistrar> providers = new HashMap<ProviderKey,DomainRegistrar>();

    /**
     * Gets the provider for the given parameters.<br>
     * <br>
     * Only one instance of each unique providerId, classname and all parameters will be created.<br>
     */
    public static DomainRegistrar getDomainRegistrar(
        String providerId,
        String className,
        String param1,
        String param2,
        String param3,
        String param4
    ) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        // The key in the map
        ProviderKey processorKey = new ProviderKey(
            providerId,
            className,
            param1,
            param2,
            param3,
            param4
        );

        // Now synchronize access to processors
        synchronized(providers) {
            // Look for existing instance
            DomainRegistrar provider = providers.get(processorKey);
            if(provider==null) {
                // Instantiate through reflection
                Class<? extends DomainRegistrar> clazz = Class.forName(className).asSubclass(DomainRegistrar.class);

                // Try the providerId + 4-parameter constructor
                try {
                    Constructor<? extends DomainRegistrar> constructor = clazz.getConstructor(String.class, String.class, String.class, String.class, String.class);
                    provider = constructor.newInstance(providerId, param1, param2, param3, param4);
                } catch(NoSuchMethodException err) {
                    // Fall through to next param set
                } catch(IllegalAccessException err) {
                    // Fall through to next param set
                } catch(InstantiationException err) {
                    // Fall through to next param set
                } catch(InvocationTargetException err) {
                    // Fall through to next param set
                }

                if(provider==null) {
                    // Try the providerId + 3-parameter constructor
                    try {
                        Constructor<? extends DomainRegistrar> constructor = clazz.getConstructor(String.class, String.class, String.class, String.class);
                        provider = constructor.newInstance(providerId, param1, param2, param3);
                    } catch(NoSuchMethodException err) {
                        // Fall through to next param set
                    } catch(IllegalAccessException err) {
                        // Fall through to next param set
                    } catch(InstantiationException err) {
                        // Fall through to next param set
                    } catch(InvocationTargetException err) {
                        // Fall through to next param set
                    }
                }

                if(provider==null) {
                    // Try the providerId + 2-parameter constructor
                    try {
                        Constructor<? extends DomainRegistrar> constructor = clazz.getConstructor(String.class, String.class, String.class);
                        provider = constructor.newInstance(providerId, param1, param2);
                    } catch(NoSuchMethodException err) {
                        // Fall through to next param set
                    } catch(IllegalAccessException err) {
                        // Fall through to next param set
                    } catch(InstantiationException err) {
                        // Fall through to next param set
                    } catch(InvocationTargetException err) {
                        // Fall through to next param set
                    }
                }

                if(provider==null) {
                    // Try the providerId + 1-parameter constructor
                    try {
                        Constructor<? extends DomainRegistrar> constructor = clazz.getConstructor(String.class, String.class);
                        provider = constructor.newInstance(providerId, param1);
                    } catch(NoSuchMethodException err) {
                        // Fall through to next param set
                    } catch(IllegalAccessException err) {
                        // Fall through to next param set
                    } catch(InstantiationException err) {
                        // Fall through to next param set
                    } catch(InvocationTargetException err) {
                        // Fall through to next param set
                    }
                }

                if(provider==null) {
                    // Try the providerId constructor, if fails allow exception to go out of this method
                    Constructor<? extends DomainRegistrar> constructor = clazz.getConstructor(String.class);
                    provider = constructor.newInstance(providerId);
                }
                
                // Create and add to cache
                providers.put(processorKey, provider);
            }
            return provider;
        }
    }

    private DomainRegistrarFactory() {
        // Make no instances
    }
}
