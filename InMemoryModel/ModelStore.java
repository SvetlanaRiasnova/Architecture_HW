package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore {

    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangedObserver> ChangedObservers;

     public ModelStore(List<IModelChangeObserver> changedObservers) throws Exception {

        this.ChangedObservers = changedObservers;
        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

        Models.add(new PoligonalModel(null));
        Flashes.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene(0,Models,Flashes, Cameras));

        public Scene GetScena(int ID) {
            for (int i = 0; i < Scenes.size(); i++) {
                if (Scenes.get(i).ID == ID) {
                    return Scenes.get(i);
                }
    
            }
            return null;
        }
    
       
        @Override
        public void NotifyChange(IModelChanger sender) {
    
        }
    }
}
