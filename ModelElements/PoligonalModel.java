package ModelElements;

public class PoligonalModel {
    
    public List<Poligon> Poligons;
    public List<Texture> Textures;

    public PoligonModel(List<Texture> textures) {
        Textures = textures;
        Poligons = new ArrayList<>();
    }
}
