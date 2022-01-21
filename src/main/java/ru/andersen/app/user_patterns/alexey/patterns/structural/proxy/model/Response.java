package ru.andersen.app.user_patterns.alexey.patterns.structural.proxy.model;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.patterns.structural.proxy.model
*/

public class Response {
    private String url;
    private String data;
    private int code;

    public Response(String url, String data, int code) {
        this.url = url;
        this.data = data;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "url='" + url + '\'' +
                ", data='" + data + '\'' +
                ", code=" + code +
                '}';
    }
}
