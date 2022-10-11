

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class MessageCreator {
    public static void main(String[] args) {
        File textFile = new File("C:\\Users\\shani\\Downloads\\Test.txt" );
        try {
            String data = FileUtils.readFileToString(textFile);
            for (int i=101;i<200;i++) {
                String tempData = data;
                tempData = tempData.replace("QA/ECS/02", "QATest"+i).replace("ECS-Connectivity Test 3","ECSSSB-Connect Test"+i);
                FileUtils.writeStringToFile(new File("C:\\Users\\shani\\Downloads\\final_out\\ECSNUS30_MT999_"+i+".txt"), tempData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}