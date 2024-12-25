package comp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Folder extends Component{
    private List<Component> components =new ArrayList<>();
    @Override
    public void print() {
        String tab = tab();
        System.out.print(tab + "Folder =>  " + name);
        for (Component c : components) {
            c.print();
        }
    }
        public void addChild(Component component) {
            component.level = this.level + 1;
            this.components.add(component);
        }
    public  List<Component> getChildren() {
        return components;
    }
    public Component getChild(String name) {
        Optional<Component> first = components.stream().filter(c -> c.name == name).findFirst();
        // for (Component c : components){
        //if (c.name == name);
        //  return c ;}
        if ( first.isPresent()) return first.get();
        else return null;
    }

    public Folder(String name, List<Component> components) {
        super(name);
    }

    public Folder(String root) {
        super(root);
    }



    }





