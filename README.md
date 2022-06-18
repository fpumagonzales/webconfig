# webconfig

Example of how to read YML file with Spring.

Based on:
* [Baeldung | Inject a Map from a YAML File with Spring](https://www.baeldung.com/spring-yaml-inject-map)
* [Baeldung | @PropertySource with YAML Files in Spring Boot](https://www.baeldung.com/spring-yaml-propertysource)

Endpoints:

http://localhost:7011/config
```json
{
    "ips": [
        "10.10.10.10",
        "10.10.10.11",
        "10.10.10.12",
        "10.10.10.13"
    ],
    "filesystem": [
        "/dev/root",
        "/dev/md2",
        "/dev/md4"
    ]
}
```