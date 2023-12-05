/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author ConlyAriella
 */
public class Login {
    
    String username;
    private String password;
    private String InputUser ;
    String hasilcek;
    
    public Login(){
        password = "ITN_MALANG";
    }

    //setter
    public void setInputUser(String InputUser) {
        this.InputUser = InputUser;
    }
   
    String cocokanPass(){
        if(password.compareTo(InputUser)== 0){
            hasilcek = "Password benar";
        }
        else{
            hasilcek = "Password salah";
        }
        return hasilcek;
    }
}
