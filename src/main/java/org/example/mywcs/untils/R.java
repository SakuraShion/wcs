package org.example.mywcs.untils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author：hb
 * @Package：org.example.mywcs.untils
 * @Project：my-wcs
 * @Date：26/11/2024 11:52 am
 */
public class R extends HashMap<String, Object>  {
    public R() {
        put("code", 0);
        put("msg", "操作成功");
    }

    public static R error() {
        return error(1, "操作失败");
    }

    public static R error(String msg) {
        return error(500, msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("msg", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public static R ok() {
        return new R();
    }
    @Override
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
