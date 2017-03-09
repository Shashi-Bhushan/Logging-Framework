package com.shashi.logging.constant;

import com.shashi.logging.LoggerImpl;

/**
 * Enumeration for different log levels. Supports Info, Debug, Warn and Error Log Levels.
 * Internally, each {@link LoggerImpl.LOG_LEVEL} is represented by a integer, Starting with 1.
 * Reason for this is to facilitate comparison between different {@link LoggerImpl.LOG_LEVEL}s, and provide
 * a better implementation for Log Level's getter methods such as {@link #isDebugEnabled()} etc.
 * Notice the snake casing in naming
 */
public enum LOG_LEVEL{
    TRACE(0),
    INFO(1),
    DEBUG(2),
    WARN(3),
    ERROR(4);

    private final int logLevel;

    LOG_LEVEL(int logLevel){
        this.logLevel = logLevel;
    }

    public int getLogLevel(){
        return this.logLevel;
    }
}
