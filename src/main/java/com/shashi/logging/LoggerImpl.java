package com.shashi.logging;

import com.shashi.logging.constant.LOG_LEVEL;
import com.shashi.logging.exception.LogLevelNotSupportedException;
import org.slf4j.Logger;
import org.slf4j.Marker;

import java.io.PrintStream;

/**
 * This class is the implementation class for slf4j's {@link Logger} class.
 * Along with the implementation of the methods such as {@link #warn(Marker, String)}, {@link #error(Marker, String)} etc,
 * it also Provides options for Setting and getting different {@link LOG_LEVEL}, setting
 * {@code out} viz output to print to log to, methods to check if different {@link LOG_LEVEL} has
 * been enabled for current settings or not.
 *
 * @author Shashi Bhushan
 *         Created on 26/2/16.
 *         For Logging-Framework
 */
public class LoggerImpl implements Logger {

    private LOG_LEVEL currentLogLevel;

    private final String clazz;

    private PrintStream out;

    /**
     * Public Constructor of the Class. Provides options to set {@code clazz}, default {@code log_level} of
     * {@link LOG_LEVEL#DEBUG} and {@code out} prints to {@link System#out} i.e. these are the
     * default values for the {@link LOG_LEVEL} and {@link PrintStream} respectively.
     *
     * @param clazz
     *      The class for which this {@link Logger} object has been created
     */
    LoggerImpl(String clazz)  {
        this.clazz = clazz;
        this.currentLogLevel = LOG_LEVEL.DEBUG;
        this.out = System.out;
    }

    /**
     * Returns the name of the Class along with the {@link Class}, for which this is the Logger.
     * The format for this is LoggerImpl[Sample.class]
     *
     * @return
     *      Quantified name of the class along with the Logging Class's name.
     */
    public String getName() {
        return String.format("%s[%s.class]", this.getClass().getName(), clazz);
    }

    public void setOutput(PrintStream out){
        if(out != null)
            this.out = out;
    }

    public PrintStream getOutput(){
        return this.out;
    }

    public void trace(String s, Object o) {

    }

    public void trace(String s, Object o, Object o1) {

    }

    public void trace(String s, Object... objects) {

    }

    public void trace(String s, Throwable throwable) {

    }

    public void trace(Marker marker, String s) {

    }

    public void trace(Marker marker, String s, Object o) {

    }

    public void trace(Marker marker, String s, Object o, Object o1) {

    }

    public void trace(Marker marker, String s, Object... objects) {

    }

    public void trace(Marker marker, String s, Throwable throwable) {

    }

    public void info(String s, Object o) {

    }

    public void info(String s, Object o, Object o1) {

    }

    public void info(String s, Object... objects) {

    }

    public void info(String s, Throwable throwable) {

    }

    public void info(Marker marker, String s) {

    }

    public void info(Marker marker, String s, Object o) {

    }

    public void info(Marker marker, String s, Object o, Object o1) {

    }

    public void info(Marker marker, String s, Object... objects) {

    }

    public void info(Marker marker, String s, Throwable throwable) {

    }

    public void debug(String s, Object o) {

    }

    public void debug(String s, Object o, Object o1) {

    }

    public void debug(String s, Object... objects) {

    }

    public void debug(String s, Throwable throwable) {

    }

    public void debug(Marker marker, String s) {

    }

    public void debug(Marker marker, String s, Object o) {

    }

    public void debug(Marker marker, String s, Object o, Object o1) {

    }

    public void debug(Marker marker, String s, Object... objects) {

    }

    public void debug(Marker marker, String s, Throwable throwable) {

    }

    public void warn(String s, Object o) {

    }

    public void warn(String s, Object... objects) {

    }

    public void warn(String s, Object o, Object o1) {

    }

    public void warn(String s, Throwable throwable) {

    }

    public void warn(Marker marker, String s) {

    }

    public void warn(Marker marker, String s, Object o) {

    }

    public void warn(Marker marker, String s, Object o, Object o1) {

    }

    public void warn(Marker marker, String s, Object... objects) {

    }

    public void warn(Marker marker, String s, Throwable throwable) {

    }

    public void error(String s, Object o) {

    }

    public void error(String s, Object o, Object o1) {

    }

    public void error(String s, Object... objects) {

    }

    public void error(String s, Throwable throwable) {

    }

    public void error(Marker marker, String s) {

    }

    public void error(Marker marker, String s, Object o) {

    }

    public void error(Marker marker, String s, Object o, Object o1) {

    }

    public void error(Marker marker, String s, Object... objects) {

    }

    public void error(Marker marker, String s, Throwable throwable) {

    }

    public void trace(String message) throws LogLevelNotSupportedException {
        printMessageInternal(message, LOG_LEVEL.TRACE);
    }

    public void info(String message) throws LogLevelNotSupportedException {
        printMessageInternal(message, LOG_LEVEL.INFO);
    }

    public void debug(String message) throws LogLevelNotSupportedException {
        printMessageInternal(message, LOG_LEVEL.DEBUG);
    }

    public void warn(String message) throws LogLevelNotSupportedException {
        printMessageInternal(message, LOG_LEVEL.WARN);
    }

    public void error(String message) throws LogLevelNotSupportedException {
        printMessageInternal(message, LOG_LEVEL.ERROR);
    }

    /**
     * Checks if the {@code currentLogLevel} is greater than or equals to Trace's {@code currentLogLevel}.
     * @return
     *      true if the {@code currentLogLevel} is greater than or equal to {@link com.shashi.logging.constant.LOG_LEVEL}'s Trace
     *      log level otherwise false
     */
    public boolean isTraceEnabled() {
        return (this.currentLogLevel.getLogLevel() >= LOG_LEVEL.TRACE.getLogLevel()) ? true : false;
    }

    public boolean isTraceEnabled(Marker marker) {
        return this.isTraceEnabled();
    }

    public boolean isInfoEnabled() {
        return (this.currentLogLevel.getLogLevel() >= LOG_LEVEL.INFO.getLogLevel()) ? true : false;
    }

    public boolean isInfoEnabled(Marker marker) {
        return this.isInfoEnabled();
    }

    public boolean isDebugEnabled(){
        return (this.currentLogLevel.getLogLevel() >= LOG_LEVEL.DEBUG.getLogLevel()) ? true : false;
    }

    public boolean isDebugEnabled(Marker marker) {
        return this.isDebugEnabled();
    }

    public boolean isWarnEnabled() {
        return (this.currentLogLevel.getLogLevel() >= LOG_LEVEL.WARN.getLogLevel()) ? true : false;
    }

    public boolean isWarnEnabled(Marker marker) {
        return this.isWarnEnabled();
    }

    public boolean isErrorEnabled() {
        return (this.currentLogLevel.getLogLevel() >= LOG_LEVEL.ERROR.getLogLevel()) ? true : false;
    }

    public boolean isErrorEnabled(Marker marker) {
        return this.isErrorEnabled();
    }

    /**
     * Get the current {@code currentLogLevel}
     * @return
     *      the current {@code currentLogLevel}
     */
    public LOG_LEVEL getCurrentLogLevel(){
        return this.currentLogLevel;
    }

    /**
     * Sets the current {@link LOG_LEVEL} to the Specified {@code currentLogLevel}
     */
    public void setCurrentLogLevel(LOG_LEVEL currentLogLevel){
        this.currentLogLevel = currentLogLevel;
    }

    /**
     * Internal Implementation of Logging for different Log Levels. Takes the argument to log, along with the log level
     * for which to log.
     *
     * @param message
     *      Message to log
     * @param logLevel
     *      {@link LOG_LEVEL}, for which the message should be logged
     *
     * @throws LogLevelNotSupportedException
     *      when the invalid {@link LOG_LEVEL} has been passed.
     */
    private void printMessageInternal(String message, LOG_LEVEL logLevel) throws LogLevelNotSupportedException {
        if(this.currentLogLevel.getLogLevel() >= logLevel.getLogLevel()){
            out.println(message);
        }else{
            throw new LogLevelNotSupportedException(logLevel + " is not Supported at this level of Logging.");
        }
    }

}
