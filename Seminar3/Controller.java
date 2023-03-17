import Exception.DataException;
import util.WriteFile;

public class Controller {
    
    public static void start(){
        
        String fileName = null;

        ViewUser view = new ViewUser();

        String[] arrayData = view.inputData();        
        ParsService parsService = new ParsService();
        var list = parsService.parsData(arrayData);

        while (list.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                list = parsService.parsData(view.inputData());
            }
        }

        fileName = "Resources/" + list.get("lastName") + ".txt";
        StringBuilder sb = new StringBuilder();
        for (String str : list.keySet()) {
            sb.append(list.get(str));
            sb.append(" ");
        }

        System.out.println(list);
        String filePath = fileName;        
        WriteFile.writeData(String.valueOf(sb), filePath);        
    }    
}
