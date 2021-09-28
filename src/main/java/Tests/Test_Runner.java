package Tests;

import Functionality.Additional_Class;
import Functionality.DOG_Breeds;
import Functionality.Logging;
import org.testng.annotations.Test;

public class Test_Runner {

    @Test
    public void getAll_Dog_Breeds_And_Verify_Status_Code_Tests()
    {
        DOG_Breeds breeds = new DOG_Breeds();
        breeds.getAllDogBreeds();
    }
    @Test (priority = 2)
    public void verify_Retriever_Is_On_The_List_Tests()
    {
        DOG_Breeds breeds = new DOG_Breeds();
        breeds.verifyRetrieverIsOnTheList();
    }
    @Test(priority =3)
    public void verify_Response_Length_Tests()
    {
        Additional_Class additional_class =new Additional_Class();
        additional_class.Get_Ten_Users();
    }
    @Test(priority = 4)
    public void post_User_And_Verify_Tests()
    {
        Additional_Class additional_class = new Additional_Class();
        additional_class.Post_User_And_Verify();
    }
    @Test(priority = 5)
    public void logging_Tests()
    {
        Logging logging = new Logging();
        logging.Log_Response();
    }
}
