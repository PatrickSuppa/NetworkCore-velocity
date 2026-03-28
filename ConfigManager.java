package com.network.core.config;

import org.yaml.snakeyaml.Yaml;
import java.io.InputStream;
import java.util.Map;

public class ConfigManager {

    private Map<String, Object> config;

    public void load(InputStream input) {
        Yaml yaml = new Yaml();
        config = yaml.load(input);
    }

    public Object get(String path) {
        String[] keys = path.split("\\.");
        Object current = config;

        for (String key : keys) {
            if (!(current instanceof Map)) return null;
            current = ((Map<?, ?>) current).get(key);
        }
        return current;
    }
}
