import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Banner {

    private static HashMap<Integer, Set<Summonable>> banner_items_permanent = new HashMap<>();
    private static HashMap<Integer, Set<Summonable>> banner_items_venti = new HashMap<>();
    private static HashMap<Integer, Set<Summonable>> banner_items_klee = new HashMap<>();
    private static HashMap<Integer, Set<Summonable>> banner_items_tartaglia = new HashMap<>();
    private static HashMap<Integer, Set<Summonable>> banner_items_zhongli = new HashMap<>();
    private static HashMap<Integer, Set<Summonable>> banner_items_albedo = new HashMap<>();
    private static HashMap<Integer, Set<Summonable>> banner_items_ganyu = new HashMap<>();
    private static HashMap<Integer, Set<Summonable>> banner_items_xiao = new HashMap<>();

    static {
        // Adding [3,5] representing the stars.
        // This way we can get a different Set for each star.
        for (int i = 3; i <= 5; i++) {
            banner_items_permanent.put(i, new HashSet<>());
        }
        // Characters Permanent banner:
        // 5*
        //Banner.banner_items_albedo.get(5).add(new Character("Albedo", Element.GEO, Stars.FIVE));
        Banner.banner_items_permanent.get(5).add(new Character( "Keching", Element.ELECTRO, Stars.FIVE));
        Banner.banner_items_permanent.get(5).add(new Character( "Mona", Element.HYDRO, Stars.FIVE));
        Banner.banner_items_permanent.get(5).add(new Character( "Qiqi", Element.CRYO, Stars.FIVE));
        Banner.banner_items_permanent.get(5).add(new Character( "Diluc", Element.PYRO, Stars.FIVE));
        Banner.banner_items_permanent.get(5).add(new Character( "Jean", Element.ANEMO, Stars.FIVE));
        // 4*
        Banner.banner_items_permanent.get(4).add(new Character("Sucrose", Element.ANEMO, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Character("Bennett", Element.PYRO, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Character("Fischl", Element.ELECTRO, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Character("Diona", Element.CRYO, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Character("Chongyung", Element.CRYO, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Character("Noelle", Element.GEO, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Character("Ninguang", Element.GEO, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Character("Xingchiu", Element.HYDRO, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Character("Beidou", Element.ELECTRO, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Character("Xiangling", Element.PYRO, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Character("Razor", Element.ELECTRO, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Character("Barbara", Element.HYDRO, Stars.FOUR));
        // Weapons Permanent banner:
        // 5*
        Banner.banner_items_permanent.get(5).add(new Weapon("Arco de Amos", WeaponType.BOWS, Stars.FIVE));
        Banner.banner_items_permanent.get(5).add(new Weapon("Alas Celestiales", WeaponType.BOWS, Stars.FIVE));
        Banner.banner_items_permanent.get(5).add(new Weapon("Oracion Perdida de los Vientos Sagrados", WeaponType.CATALYST, Stars.FIVE));
        Banner.banner_items_permanent.get(5).add(new Weapon("Pergamino Celestial", WeaponType.CATALYST, Stars.FIVE));
        Banner.banner_items_permanent.get(5).add(new Weapon("Halcon de Jade", WeaponType.POLEARM, Stars.FIVE));
        Banner.banner_items_permanent.get(5).add(new Weapon("Pua Celestial", WeaponType.POLEARM, Stars.FIVE));
        Banner.banner_items_permanent.get(5).add(new Weapon("Lapida del Lobo", WeaponType.CLAYMORE, Stars.FIVE));
        Banner.banner_items_permanent.get(5).add(new Weapon("Orgullo Celestial", WeaponType.CLAYMORE, Stars.FIVE));
        Banner.banner_items_permanent.get(5).add(new Weapon("Hoja Afilada Celestial", WeaponType.SWORD, Stars.FIVE));
        Banner.banner_items_permanent.get(5).add(new Weapon("Aquila Favonia", WeaponType.SWORD, Stars.FIVE));
        // 4*
        Banner.banner_items_permanent.get(4).add(new Weapon("Rust", WeaponType.BOWS, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Weapon("Sacrificial Bow", WeaponType.BOWS, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Weapon("Stringless", WeaponType.BOWS, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Weapon("Favonius Bow", WeaponType.BOWS, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Weapon("Ojo de la Perspicacia", WeaponType.CATALYST, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Weapon("Sacrificial Memories", WeaponType.CATALYST, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Weapon("Sinfonia de los Merodeadores", WeaponType.CATALYST, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Weapon("Codice de Favonius", WeaponType.CATALYST, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Weapon("Favonius Lance", WeaponType.POLEARM, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Weapon("Perdicion del Dragon", WeaponType.POLEARM, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Weapon("Segadora de la lluvia", WeaponType.CLAYMORE, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Weapon("Gran Espada de Sacrificio", WeaponType.SWORD, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Weapon("Espada del tiempo", WeaponType.CLAYMORE, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Weapon("Gran Espada de Favonius", WeaponType.SWORD, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Weapon("Rugido de Leon", WeaponType.SWORD, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Weapon("Sacrificial Sword", WeaponType.SWORD, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Weapon("Flute", WeaponType.SWORD, Stars.FOUR));
        Banner.banner_items_permanent.get(4).add(new Weapon("Favonius Sword", WeaponType.SWORD, Stars.FOUR));
        // 3*
        Banner.banner_items_permanent.get(3).add(new Weapon("Tirachinas", WeaponType.BOWS, Stars.THREE));
        Banner.banner_items_permanent.get(3).add(new Weapon("Juramento del Arquero", WeaponType.BOWS, Stars.THREE));
        Banner.banner_items_permanent.get(3).add(new Weapon("Arco de Cuervo", WeaponType.BOWS, Stars.THREE));
        Banner.banner_items_permanent.get(3).add(new Weapon("Orbe Esmeralda", WeaponType.CATALYST, Stars.THREE));
        Banner.banner_items_permanent.get(3).add(new Weapon("Cuentos de Cazadores de Dragones", WeaponType.CATALYST, Stars.THREE));
        Banner.banner_items_permanent.get(3).add(new Weapon("Guia Magica", WeaponType.CATALYST, Stars.THREE));
        Banner.banner_items_permanent.get(3).add(new Weapon("Borla Negra", WeaponType.CATALYST, Stars.THREE));
        Banner.banner_items_permanent.get(3).add(new Weapon("Garrote del Debate", WeaponType.CLAYMORE, Stars.THREE));
        Banner.banner_items_permanent.get(3).add(new Weapon("Gran Espada Sangrienta", WeaponType.SWORD, Stars.THREE));
        Banner.banner_items_permanent.get(3).add(new Weapon("Sombra Ferrea", WeaponType.CLAYMORE, Stars.THREE));
        Banner.banner_items_permanent.get(3).add(new Weapon("Espada Surcacielos", WeaponType.SWORD, Stars.THREE));
        Banner.banner_items_permanent.get(3).add(new Weapon("Espada del Alba", WeaponType.SWORD, Stars.THREE));
        Banner.banner_items_permanent.get(3).add(new Weapon("Hoja Fria", WeaponType.SWORD, Stars.THREE));
    }


    public static HashMap<Integer, Set<Summonable>> getItemsBanner(String banner) {
        switch (banner) {
            case "Venti":
                return Banner.banner_items_venti;
            case "Klee":
                return Banner.banner_items_klee;
            case "Tartaglia":
                return Banner.banner_items_tartaglia;
            case "Zhongli":
                return Banner.banner_items_zhongli;
            case "Albedo":
                return Banner.banner_items_albedo;
            case "Ganyo":
                return Banner.banner_items_ganyu;
            case "Permanent":
                return Banner.banner_items_permanent;
            default:
                return null;
        }
    }

    /*public static List<Summonable> wish(int num_wishes, String banner) {
        if (this.primogems < 160) {
            System.out.println("You don't have primogems!");
        } else if (1 < num_wishes && this.primogems < 1600) {
            System.out.println("You don't have enough primogems!");
            System.out.println("You can only single pull!");
        } else {
            return wishes(num_wishes, banner);
        }
    }

    private List<Summonable> wishes(int num_wishes, String version) {
        this.primogems -= 160 * num_wishes;
        ArrayList<Item> items = new ArrayList<>();
        HashMap<Item, Float> banner = Banner.getItemsBanner(version);
        ArrayList<Item> items_banner = new ArrayList<>();
        items_banner.addAll(banner.keySet());
        boolean picked = false;
        Random rnd = new Random();
        boolean five_stars;
        for (int i = 0; i < num_wishes; i++) {
            do {
                pitty++;
                Summonable item = null;
                do {
                    if (item == null) {
                        float prob_five = 0.4f + pitty/150.0f;
                        double prob = Math.random() - prob_five;
                        int random_item = rnd.nextInt(items_banner.size());
                        item = items_banner.get(random_item);
                        if (prob <= 0 && item.getNumStars() != 5) {
                            five_stars = true;
                        } else {
                            five_stars = false;
                        }
                    } else {
                        item = items_banner.get(random_item);
                    }
                } while (!five_stars);
                float prob_item = banner.get(item);
                double prob_having_it = 1.0 - Math.pow(1.0 - prob_item, pitty);
                if (item instanceof Character && item.stars.equals(Stars.FIVE)) {
                    prob_having_it += pitty/150.0;
                    five_stars = true;
                } else {
                    five_stars = false;
                    prob_having_it -= pitty/150.0;
                }
                double pick = prob_having_it - prob_item;
                if (pick <= 0) {
                    if (five_stars) {
                        this.pitty = 0;
                    }
                    picked = true;
                    items.add(item);
                }
            } while (!picked);
            picked = false;
        }
        return items;
    }*/
}
