// import java.util.UUID;
// import com.amazonaws.services.AWSLogsClient;
// public class LambdaUsingUUID {

//    private AWSLogsClient logs;
//    private final UUID sandboxId;

//    public LambdaUsingUUID() {
//       sandboxId = UUID.randomUUID(); // <-- unique content created
//       logs = new AWSLogsClient();
//    }
//    @Override
//    public String handleRequest(Map<String,String> event, Context context) {
//       CreateLogStreamRequest request = new CreateLogStreamRequest(
//         "myLogGroup", sandboxId + ".log9.txt");
//         logs.createLogStream(request);     
//         return "Hello world!";
//    }
// } 