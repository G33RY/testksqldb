# Run
Change the table name to a table of your choice in the `TestEndpoint` file on line `24`, then deploy it to a wildfly server. 

Go to http://localhost:8080/test -- *Or the host of your wildfly server and `/test`*

# My Tests
- Java 11 & Wildfly 20
- Java 11 & Wildfly 26
- Java 8 & Wildfly 20
- Java 8 & Wildfly 26

Ran `maven clean` before every rebuild.


# Error Logs

```
20:45:34,817 ERROR [io.confluent.shaded.io.vertx.core.impl.ContextBase] (vert.x-eventloop-thread-1) Unhandled exception: java.lang.NoSuchMethodError: 'void io.confluent.ksql.util.VertxUtils.checkContext(io.confluent.shaded.io.vertx.core.Context)'
	at deployment.testksqldb-1.0.war//io.confluent.ksql.api.client.impl.ResponseHandler.checkContext(ResponseHandler.java:59)
	at deployment.testksqldb-1.0.war//io.confluent.ksql.api.client.impl.ResponseHandler.handleBodyBuffer(ResponseHandler.java:38)
	at deployment.testksqldb-1.0.war//io.confluent.ksql.api.client.impl.ExecuteQueryResponseHandler.handleBodyBuffer(ExecuteQueryResponseHandler.java:37)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.parsetools.impl.RecordParserImpl.handleParsing(RecordParserImpl.java:214)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.parsetools.impl.RecordParserImpl.handle(RecordParserImpl.java:285)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.parsetools.impl.RecordParserImpl.handle(RecordParserImpl.java:27)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:264)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.HttpEventHandler.handleChunk(HttpEventHandler.java:51)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.HttpClientResponseImpl.handleChunk(HttpClientResponseImpl.java:239)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.Http2ClientConnection$StreamImpl.handleData(Http2ClientConnection.java:457)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.VertxHttp2Stream.lambda$new$1(VertxHttp2Stream.java:69)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.streams.impl.InboundBuffer.handleEvent(InboundBuffer.java:239)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.streams.impl.InboundBuffer.write(InboundBuffer.java:129)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.impl.EventLoopContext.execute(EventLoopContext.java:76)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.impl.ContextBase.execute(ContextBase.java:232)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.VertxHttp2Stream.onData(VertxHttp2Stream.java:115)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.Http2ConnectionBase.onDataRead(Http2ConnectionBase.java:313)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.Http2FrameListenerDecorator.onDataRead(Http2FrameListenerDecorator.java:36)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.Http2EmptyDataFrameListener.onDataRead(Http2EmptyDataFrameListener.java:49)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder$FrameReadListener.onDataRead(DefaultHttp2ConnectionDecoder.java:307)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.DefaultHttp2FrameReader.readDataFrame(DefaultHttp2FrameReader.java:415)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.DefaultHttp2FrameReader.processPayloadState(DefaultHttp2FrameReader.java:250)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.DefaultHttp2FrameReader.readFrame(DefaultHttp2FrameReader.java:159)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.decodeFrame(DefaultHttp2ConnectionDecoder.java:173)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.DecoratingHttp2ConnectionDecoder.decodeFrame(DecoratingHttp2ConnectionDecoder.java:63)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.Http2ConnectionHandler$FrameDecoder.decode(Http2ConnectionHandler.java:393)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.Http2ConnectionHandler.decode(Http2ConnectionHandler.java:453)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.ByteToMessageDecoder.decodeRemovalReentryProtection(ByteToMessageDecoder.java:529)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.ByteToMessageDecoder.callDecode(ByteToMessageDecoder.java:468)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:290)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.VertxHttp2ConnectionHandler.channelRead(VertxHttp2ConnectionHandler.java:408)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:788)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:724)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:650)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)

20:45:34,827 ERROR [io.confluent.shaded.io.vertx.core.impl.ContextBase] (vert.x-eventloop-thread-1) Unhandled exception: java.lang.NoSuchMethodError: 'void io.confluent.ksql.util.VertxUtils.checkContext(io.confluent.shaded.io.vertx.core.Context)'
	at deployment.testksqldb-1.0.war//io.confluent.ksql.api.client.impl.ResponseHandler.checkContext(ResponseHandler.java:59)
	at deployment.testksqldb-1.0.war//io.confluent.ksql.api.client.impl.ResponseHandler.handleBodyBuffer(ResponseHandler.java:38)
	at deployment.testksqldb-1.0.war//io.confluent.ksql.api.client.impl.ExecuteQueryResponseHandler.handleBodyBuffer(ExecuteQueryResponseHandler.java:37)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.parsetools.impl.RecordParserImpl.handleParsing(RecordParserImpl.java:214)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.parsetools.impl.RecordParserImpl.handle(RecordParserImpl.java:285)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.parsetools.impl.RecordParserImpl.handle(RecordParserImpl.java:27)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:264)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.HttpEventHandler.handleChunk(HttpEventHandler.java:51)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.HttpClientResponseImpl.handleChunk(HttpClientResponseImpl.java:239)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.Http2ClientConnection$StreamImpl.handleData(Http2ClientConnection.java:457)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.VertxHttp2Stream.lambda$new$1(VertxHttp2Stream.java:69)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.streams.impl.InboundBuffer.handleEvent(InboundBuffer.java:239)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.streams.impl.InboundBuffer.write(InboundBuffer.java:129)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.impl.EventLoopContext.execute(EventLoopContext.java:76)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.impl.ContextBase.execute(ContextBase.java:232)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.VertxHttp2Stream.onData(VertxHttp2Stream.java:115)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.Http2ConnectionBase.onDataRead(Http2ConnectionBase.java:313)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.Http2FrameListenerDecorator.onDataRead(Http2FrameListenerDecorator.java:36)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.Http2EmptyDataFrameListener.onDataRead(Http2EmptyDataFrameListener.java:49)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder$FrameReadListener.onDataRead(DefaultHttp2ConnectionDecoder.java:307)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.DefaultHttp2FrameReader.readDataFrame(DefaultHttp2FrameReader.java:415)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.DefaultHttp2FrameReader.processPayloadState(DefaultHttp2FrameReader.java:250)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.DefaultHttp2FrameReader.readFrame(DefaultHttp2FrameReader.java:159)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.decodeFrame(DefaultHttp2ConnectionDecoder.java:173)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.DecoratingHttp2ConnectionDecoder.decodeFrame(DecoratingHttp2ConnectionDecoder.java:63)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.Http2ConnectionHandler$FrameDecoder.decode(Http2ConnectionHandler.java:393)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.Http2ConnectionHandler.decode(Http2ConnectionHandler.java:453)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.ByteToMessageDecoder.decodeRemovalReentryProtection(ByteToMessageDecoder.java:529)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.ByteToMessageDecoder.callDecode(ByteToMessageDecoder.java:468)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:290)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.VertxHttp2ConnectionHandler.channelRead(VertxHttp2ConnectionHandler.java:408)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:788)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:724)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:650)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)

20:45:34,827 ERROR [io.confluent.shaded.io.vertx.core.impl.ContextBase] (vert.x-eventloop-thread-1) Unhandled exception: java.lang.NoSuchMethodError: 'void io.confluent.ksql.util.VertxUtils.checkContext(io.confluent.shaded.io.vertx.core.Context)'
	at deployment.testksqldb-1.0.war//io.confluent.ksql.api.client.impl.ResponseHandler.checkContext(ResponseHandler.java:59)
	at deployment.testksqldb-1.0.war//io.confluent.ksql.api.client.impl.ResponseHandler.handleBodyBuffer(ResponseHandler.java:38)
	at deployment.testksqldb-1.0.war//io.confluent.ksql.api.client.impl.ExecuteQueryResponseHandler.handleBodyBuffer(ExecuteQueryResponseHandler.java:37)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.parsetools.impl.RecordParserImpl.handleParsing(RecordParserImpl.java:214)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.parsetools.impl.RecordParserImpl.lambda$handler$0(RecordParserImpl.java:316)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:264)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:246)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.HttpEventHandler.handleEnd(HttpEventHandler.java:76)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.HttpClientResponseImpl.handleEnd(HttpClientResponseImpl.java:250)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.Http2ClientConnection$StreamImpl.handleEnd(Http2ClientConnection.java:450)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.VertxHttp2Stream.lambda$new$1(VertxHttp2Stream.java:63)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.streams.impl.InboundBuffer.handleEvent(InboundBuffer.java:239)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.streams.impl.InboundBuffer.write(InboundBuffer.java:129)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.impl.EventLoopContext.emit(EventLoopContext.java:55)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.impl.ContextBase.emit(ContextBase.java:239)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.VertxHttp2Stream.onEnd(VertxHttp2Stream.java:135)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.Http2ClientConnection$Stream.onEnd(Http2ClientConnection.java:277)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.VertxHttp2Stream.onEnd(VertxHttp2Stream.java:130)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.Http2ConnectionBase.onDataRead(Http2ConnectionBase.java:315)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.Http2FrameListenerDecorator.onDataRead(Http2FrameListenerDecorator.java:36)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.Http2EmptyDataFrameListener.onDataRead(Http2EmptyDataFrameListener.java:49)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder$FrameReadListener.onDataRead(DefaultHttp2ConnectionDecoder.java:307)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.DefaultHttp2FrameReader.readDataFrame(DefaultHttp2FrameReader.java:415)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.DefaultHttp2FrameReader.processPayloadState(DefaultHttp2FrameReader.java:250)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.DefaultHttp2FrameReader.readFrame(DefaultHttp2FrameReader.java:159)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.DefaultHttp2ConnectionDecoder.decodeFrame(DefaultHttp2ConnectionDecoder.java:173)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.DecoratingHttp2ConnectionDecoder.decodeFrame(DecoratingHttp2ConnectionDecoder.java:63)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.Http2ConnectionHandler$FrameDecoder.decode(Http2ConnectionHandler.java:393)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.http2.Http2ConnectionHandler.decode(Http2ConnectionHandler.java:453)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.ByteToMessageDecoder.decodeRemovalReentryProtection(ByteToMessageDecoder.java:529)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.ByteToMessageDecoder.callDecode(ByteToMessageDecoder.java:468)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:290)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.vertx.core.http.impl.VertxHttp2ConnectionHandler.channelRead(VertxHttp2ConnectionHandler.java:408)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:788)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:724)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:650)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at deployment.testksqldb-1.0.war//io.confluent.shaded.io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)


```
