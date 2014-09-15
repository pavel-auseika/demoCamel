package tasks;

import java.util.HashMap;
import java.util.Map;

public abstract class Task {

    protected Object body;

    protected Map<String, Object> headers = new HashMap<>();

    public Task () {
        prepare();
    }

    protected abstract void prepare ();

    public Object getBody () {
        return body;
    }

    public Map<String, Object> getHeaders () {
        return headers;
    }
}
