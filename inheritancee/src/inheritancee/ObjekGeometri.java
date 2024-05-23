package Inheritancee;
/**
 *
 * @author Farrel
 */
public class ObjekGeometri {
    private String warna = "putih";
    private boolean filled;

    // Konstruktor tanpa argumen
    public ObjekGeometri() {
    }

    // Konstruktor dengan parameter
    public ObjekGeometri(String warna, boolean filled) {
        this.warna = warna;
        this.filled = filled;
    }
    
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
