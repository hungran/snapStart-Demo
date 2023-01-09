// package helloworld;

// import java.io.IOException;
// import org.crac.Core;
// import org.crac.Resource;

// import com.amazonaws.services.lambda.runtime.Context;
// import com.amazonaws.services.lambda.runtime.RequestHandler;
// import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
// import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

// public class CracDemo implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent>, Resource {
//     public CracDemo() {
//         Core.getGlobalContext().register(this);
//     }

//     public void beforeCheckpoint(org.crac.Context<? extends Resource> context)
//         throws IOException {
//       System.out.println("Before checkpoint");

//       try {
//         generateInt.generateRandomInterger();
//       } catch (IOException e) {
//         System.out.println("Before checkpoint Error:" + e);
//       }
//     }

//     public void afterRestore(org.crac.Context<? extends Resource> context)
//         throws IOException {
//       System.out.println("After restore");

//       try {
//         generateInt.generateRandomInterger();
//       } catch (IOException e) {
//         System.out.println("After restore Error:" + e);
//       }
//     }
// }