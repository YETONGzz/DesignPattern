    避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，
直到有对象处理它为止。职责链模式是一种对象行为型模式。

    职责链可以是一条直线、一个环或者一个树形结构，最常见的职责链是直线型，即沿着一条单向的链来传递请求。链上的每一个对象都是请求处理者，
职责链模式可以将请求的处理者组织成一条链，并让请求沿着链传递，由链上的处理者对请求进行相应的处理，
客户端无须关心请求的处理细节以及请求的传递，只需将请求发送到链上即可，实现请求发送者和请求处理者解耦。

    需要注意的是，职责链模式并不创建职责链，职责链的创建工作必须由系统的其他部分来完成，一般是在使用该职责链的客户端中创建职责链。
职责链模式降低了请求的发送端和接收端之间的耦合，使多个对象都有机会处理这个请求。 

.适用场景

      在以下情况下可以考虑使用职责链模式：

       (1) 有多个对象可以处理同一个请求，具体哪个对象处理该请求待运行时刻再确定，客户端只需将请求提交到链上，
            而无须关心请求的处理对象是谁以及它是如何处理的。

       (2) 在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。

        (3) 可动态指定一组对象处理请求，客户端可以动态创建职责链来处理请求，还可以改变链中处理者之间的先后次序。 

