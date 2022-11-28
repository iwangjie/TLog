package com.yomahub.tlog.function;

/**
 * 说明
 *
 * @author 王杰
 * So close, so far away
 */
@FunctionalInterface
public interface Filter<T> {
    boolean accept(T var1);
}
