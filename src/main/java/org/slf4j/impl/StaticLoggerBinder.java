package org.slf4j.impl;

/**
 * The binding of {@link org.slf4j.LoggerFactory} class with an actual instance of {@link org.slf4j.ILoggerFactory} is
 * performed using information returned by this class.
 *
 * This class is a custom implementation of {@link org.slf4j.spi.LoggerFactoryBinder} of slf4j API.
 * It holds a Singleton object of itself, which can be accessed via a static method {@link #getSingleton()}.
 *
 * Also, holds a custom implementation of {@link org.slf4j.ILoggerFactory}, which returns {@link com.shashi.logging.LoggerFactoryImpl}
 * object when {@link #getLoggerFactory()} is called.
 *
 * @author Shashi Bhushan
 *         Created on 1/3/16.
 *         For Logging-Framework
 */
import com.shashi.logging.LoggerFactoryImpl;
import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

public class StaticLoggerBinder implements LoggerFactoryBinder {

    /**
     * Singleton object of Class.
     * Used by SLF4J to get Framework specific implementation of {@link ILoggerFactory}
     */
    private static final StaticLoggerBinder SINGLETON = new StaticLoggerBinder();
    public static String REQUESTED_API_VERSION = "1.6.99";
    private static final String loggerFactoryClassStr = LoggerFactoryImpl.class.getName();
    private final ILoggerFactory loggerFactory = new LoggerFactoryImpl();

    /**
     * Returns the Singleton {@link StaticLoggerBinder} object
     *
     * @return
     *      Singleton implementation object of {@link StaticLoggerBinder}
     */
    public static final StaticLoggerBinder getSingleton() {
        return SINGLETON;
    }

    /**
     * Private constructor prevents object spawning for {@link StaticLoggerBinder} class from outside the class.
     */
    private StaticLoggerBinder() {
    }

    /**
     * @see {@link LoggerFactoryBinder#getLoggerFactory()}
     *
     * Provides an implementation of {@link ILoggerFactory}'s object, which is being held by {@code loggerFactory} of
     * the class
     *
     * @return
     *      Framework's custom implementation of {@link ILoggerFactory}'s object
     */
    public ILoggerFactory getLoggerFactory() {
        return this.loggerFactory;
    }

    /**
     * Name of the {@link ILoggerFactory} implementation class as a String
     *
     * @return
     *      Name of the {@link ILoggerFactory} implementation class
     */
    public String getLoggerFactoryClassStr() {
        return loggerFactoryClassStr;
    }
}
