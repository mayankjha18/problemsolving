package todo;

public class TestClient {
    String host;
    String name;
    String  password;
    TestClient testClient;


    public TestClient addHost(String host) {
        this.host = host;
        return this;
    }

    public TestClient addName(String name) {
        this.name = name;
        return this;

    }

    public TestClient addPassword(String password) {
        this.password = password;
        return this;

    }

    public TestClient build()
    {
        return testClient;
    }

}
