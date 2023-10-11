package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> cameras = new ArrayList<Camera>();

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        
        this.id = id;
        
        if (models.size() > 0) {
            this.Models = models;
        } else {
            throw new Exception("Должна быть хотя бы одна модель");
        }

        this.Flashes = flashes;
        
        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("Должна быть хлтя бы одна модель");
        }
    }

    public Type1 method1(Type type) {
        return type;
    }

    public Type2  method2(Type type, Type type) {
        return type;
    }

}
