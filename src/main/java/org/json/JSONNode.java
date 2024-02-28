package org.json;

/**
 * Represents a node in a JSON structure, including a key, value, and the path from the root.
 */
public class JSONNode {
    private final String key;   // The key of the JSON node
    private final Object value; // The value of the JSON node
    private final String path;  // The path from the root to this node

    /**
     * Constructs a JSONNode with the specified key, value, and path.
     *
     * @param key The key associated with this node.
     * @param value The value of this node.
     * @param path The path from the root to this node.
     */
    public JSONNode(String key, Object value, String path) {
        this.key = key;
        this.value = value;
        this.path = path;
    }

    // Getters
    public String getKey() { return key; }
    public Object getValue() { return value; }
    public String getPath() { return path; }

    @Override
    public String toString() {
        return String.format("Key: %s, Value: %s, Path: %s", key, value, path);
    }
}
