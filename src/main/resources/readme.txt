开发测试环境，springboot2.2.1+jdk1.8+windows10
WebSocket测试流程：
1、启动项目。首先我们先测试客户端发送消息。访问：localhost:8080/index.html，可以发送消息，在后端的控制台可以看到服务端收到的消息
2、如果你再开浏览器窗口访问，连接总数就会跟着变话
3、服务端发送消息到客户端：访问：localhost:8080/test，未带msg参数，websocket无变化，带入msg参数访问，则客户端可以收到消息，
    如：localhost:8080/test?msg=您好，我是老猫

4、客户端查看收到消息的方法：按f12进行调试模式，选择Console就可以了

WebSocketTest测试流程：
新建三个浏览器窗口，分别是localhost:8080/index.html，localhost:8080/index2.html，localhost:8080/index3.html
然后可以互相发短信进行测试
