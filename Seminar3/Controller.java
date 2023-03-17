import Exception.NullException;

public class Controller {
    
    public static void start(){
        
        ViewUser view = new ViewUser();
        String[] arrayData = view.inputData() ;
        if(arrayData != null){
            ParsService parsService = new ParsService();
            var list = parsService.parsData(arrayData);
            System.out.println(list.toString());
        }
        else try {
                throw new NullException();
            } catch (NullException e) {
                e.nullException();
        }
        
    }

    
}
