import java.util.*;

/*
“ü–å•Ò‚Æ“¯‚¶‰‰K‚Ì‚½‚ßƒRƒƒ“ƒgÈ—ª
*/
public class Main {
	public static void main(String[] args) {
		/*
        3-1
        1.set
        2.list
        3.map
        */
		// ƒCƒ“ƒXƒ^ƒ“ƒX‰»
        Hero h1 = new Hero("—é–Ø");
        Hero h2 = new Hero("Ö“¡");

        List<Hero> heros = new ArrayList<>();
        heros.add(h1);
        heros.add(h2);
        // for
        for(int i = 0; i < heros.size(); i++) {
            System.out.println(heros.get(i).getName());
        } 
        // Šg’£for
        for(Hero h : heros) {
            System.out.println(h.getName());
        }
        // Iterator
        Iterator<Hero> it = heros.iterator();
        while(it.hasNext()) {
            it.next();
            Hero e = it.next();
            System.out.println(e.getName());
        }


        Map<Hero, Integer> heros2 = new HashMap<>();      //Map<key, value> map•Ï”
        heros2.put(h1, 5);
        heros2.put(h2, 7);

        for(Hero key : heros2.keySet()) {
            int value = heros2.get(key);
            System.out.println(key.getName() + "‚Ì“|‚µ‚½“G‚Ì”" + value);  
        }
	}
}