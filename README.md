# WebServiceDemo
JDK快速创建WebService示例

# 开发流程
1. 开发WsServer模块，启动WsServer；
2. 访问 http://localhost:8088/ws/test?wsdl, 将页面的内容保存为test.wsdl放在WsClient模块的resources下。
3. 在WsClient模块的java目录下，命令行执行`wsimport -keep ../resources/test.wsdl -Xnocompile`，会生成`org.example.server`下的所有类。
4. 开发client，调用WsServer中的接口。

