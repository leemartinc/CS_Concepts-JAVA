import java.util.*;

public class Computers {

    String CPU;
    String MB;
    String GPU;
    int RAM;
    int OS;
    String [] perfs;


    public void setCPU(String s){
        this.CPU = s;
    }

    public String getCPU(){
        return this.CPU;
    }

    public void setMB(String s){
        this.MB = s;
    }

    public String getMB(){
        return this.MB;
    }

    public void setGPU(String s){
        this.GPU = s;
    }

    public String getGPU(){
        return this.GPU;
    }

    public void setRAM(int i){
        this.RAM = i;
    }

    public int getRAM(){
        return this.RAM;
    }

    public void setOS(int i){
        this.OS = i;
    }

    public int getOS(){
        return this.OS;
    }

    public void setPerfs (String [] arr){
        this.perfs = arr;
    }

    public String getPerfs () {
        return Arrays.toString(this.perfs);
    }

}
