# injectmap
A tool for injecting a Map dataSource into an object

### example
```java
String2Date string2Date = new String2Date("yy／MM／ddHH:mm:ss");
String2Double string2Double = new String2Double();
ValuePostProcess valuePostProcess = new ValuePostProcess("projectNameOrNull");
valuePostProcess.register(string2Double);
valuePostProcess.register(string2Date);
...
Pojo demo = new Pojo();
valuePostProcess.process(demo,mapSorce);
```

```java
import com.ccand99.sdk.injectmap.convert.Value;

class Pojo {
    @Value(column = "foo",project = "test")
    private Integer foo;
}
```
Add type conversion, need to implement com.ccand99.sdk.injectmap.convertConvert interface

Add annotation processing, the need to achieve com.ccand99.sdk.injectmap.process.PostProcess interface
The new annotation handler can handle custom annotations
