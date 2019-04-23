package iteratorpattern;

import java.util.Hashtable;
import java.util.Iterator;

public class IteradorMenuHashtable implements Iterador{

  int indice = 0;
  Hashtable menu;
  Iterator iterator = menu.values().iterator();

  public IteradorMenuHashtable(Hashtable menu){
    this.menu = menu;

  }

  @Override
  public boolean hasNext(){
    return iterator.hasNext();
  }

  @Override
  public Object next(){
    return iterator.next();
  }
}
