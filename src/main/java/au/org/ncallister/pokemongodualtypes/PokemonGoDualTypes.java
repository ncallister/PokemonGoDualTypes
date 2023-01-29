/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package au.org.ncallister.pokemongodualtypes;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nathan
 */
public class PokemonGoDualTypes 
{
    /**
     * Map of damage taken.
     * {@code Map<TargetType, Map<AttackType, Damage>>}
     */
    private Map<PokemonType, Map<PokemonType, Double>> singleTypeResistance = new HashMap<>();
    
    public static final double NORMAL = 1.0;
    public static final double VULNERABLE = 1.6;
    public static final double RESISTANT = 0.625;
    public static final double DOUBLE_RESISTANT = 0.390625;
    
    public PokemonGoDualTypes()
    {
        addSingleTypes();
    }
    
    private double getSingleTypeResistance(PokemonType target, PokemonType attack)
    {
        Double resistance = singleTypeResistance.get(target).get(attack);
        if (resistance == null)
        {
            resistance = NORMAL;
        }
        return resistance;
    }
    
    private double getDoubleTypeResistance(PokemonType target1, PokemonType target2, PokemonType attack)
    {
        return getSingleTypeResistance(target1, attack) * getSingleTypeResistance(target2, attack);
    }
    
    private void addSingleTypes()
    {
        singleTypeResistance.put(PokemonType.NORMAL, new HashMap<>());
        singleTypeResistance.get(PokemonType.NORMAL).put(PokemonType.FIGHTING, VULNERABLE);
        singleTypeResistance.get(PokemonType.NORMAL).put(PokemonType.GHOST, DOUBLE_RESISTANT);
        
        singleTypeResistance.put(PokemonType.FIRE, new HashMap<>());
        singleTypeResistance.get(PokemonType.FIRE).put(PokemonType.BUG, RESISTANT);
        singleTypeResistance.get(PokemonType.FIRE).put(PokemonType.FAIRY, RESISTANT);
        singleTypeResistance.get(PokemonType.FIRE).put(PokemonType.FIRE, RESISTANT);
        singleTypeResistance.get(PokemonType.FIRE).put(PokemonType.GRASS, RESISTANT);
        singleTypeResistance.get(PokemonType.FIRE).put(PokemonType.ICE, RESISTANT);
        singleTypeResistance.get(PokemonType.FIRE).put(PokemonType.STEEL, RESISTANT);
        singleTypeResistance.get(PokemonType.FIRE).put(PokemonType.GROUND, VULNERABLE);
        singleTypeResistance.get(PokemonType.FIRE).put(PokemonType.ROCK, VULNERABLE);
        singleTypeResistance.get(PokemonType.FIRE).put(PokemonType.WATER, VULNERABLE);
        
        singleTypeResistance.put(PokemonType.WATER, new HashMap<>());
        singleTypeResistance.get(PokemonType.WATER).put(PokemonType.FIRE, RESISTANT);
        singleTypeResistance.get(PokemonType.WATER).put(PokemonType.ICE, RESISTANT);
        singleTypeResistance.get(PokemonType.WATER).put(PokemonType.STEEL, RESISTANT);
        singleTypeResistance.get(PokemonType.WATER).put(PokemonType.WATER, RESISTANT);
        singleTypeResistance.get(PokemonType.WATER).put(PokemonType.ELECTRIC, VULNERABLE);
        singleTypeResistance.get(PokemonType.WATER).put(PokemonType.GRASS, VULNERABLE);
        
        singleTypeResistance.put(PokemonType.ELECTRIC, new HashMap<>());
        singleTypeResistance.get(PokemonType.ELECTRIC).put(PokemonType.ELECTRIC, RESISTANT);
        singleTypeResistance.get(PokemonType.ELECTRIC).put(PokemonType.FLYING, RESISTANT);
        singleTypeResistance.get(PokemonType.ELECTRIC).put(PokemonType.STEEL, RESISTANT);
        singleTypeResistance.get(PokemonType.ELECTRIC).put(PokemonType.GROUND, VULNERABLE);
        
        singleTypeResistance.put(PokemonType.GRASS, new HashMap<>());
        singleTypeResistance.get(PokemonType.GRASS).put(PokemonType.ELECTRIC, RESISTANT);
        singleTypeResistance.get(PokemonType.GRASS).put(PokemonType.GRASS, RESISTANT);
        singleTypeResistance.get(PokemonType.GRASS).put(PokemonType.GROUND, RESISTANT);
        singleTypeResistance.get(PokemonType.GRASS).put(PokemonType.WATER, RESISTANT);
        singleTypeResistance.get(PokemonType.GRASS).put(PokemonType.BUG, VULNERABLE);
        singleTypeResistance.get(PokemonType.GRASS).put(PokemonType.FIRE, VULNERABLE);
        singleTypeResistance.get(PokemonType.GRASS).put(PokemonType.FLYING, VULNERABLE);
        singleTypeResistance.get(PokemonType.GRASS).put(PokemonType.ICE, VULNERABLE);
        singleTypeResistance.get(PokemonType.GRASS).put(PokemonType.POISON, VULNERABLE);
        
        singleTypeResistance.put(PokemonType.ICE, new HashMap<>());
        singleTypeResistance.get(PokemonType.ICE).put(PokemonType.ICE, RESISTANT);
        singleTypeResistance.get(PokemonType.ICE).put(PokemonType.FIGHTING, VULNERABLE);
        singleTypeResistance.get(PokemonType.ICE).put(PokemonType.FIRE, VULNERABLE);
        singleTypeResistance.get(PokemonType.ICE).put(PokemonType.ROCK, VULNERABLE);
        singleTypeResistance.get(PokemonType.ICE).put(PokemonType.STEEL, VULNERABLE);
        
        singleTypeResistance.put(PokemonType.FIGHTING, new HashMap<>());
        singleTypeResistance.get(PokemonType.FIGHTING).put(PokemonType.BUG, RESISTANT);
        singleTypeResistance.get(PokemonType.FIGHTING).put(PokemonType.DARK, RESISTANT);
        singleTypeResistance.get(PokemonType.FIGHTING).put(PokemonType.ROCK, RESISTANT);
        singleTypeResistance.get(PokemonType.FIGHTING).put(PokemonType.FAIRY, VULNERABLE);
        singleTypeResistance.get(PokemonType.FIGHTING).put(PokemonType.FLYING, VULNERABLE);
        singleTypeResistance.get(PokemonType.FIGHTING).put(PokemonType.PSYCHIC, VULNERABLE);
        
        singleTypeResistance.put(PokemonType.POISON, new HashMap<>());
        singleTypeResistance.get(PokemonType.POISON).put(PokemonType.BUG, RESISTANT);
        singleTypeResistance.get(PokemonType.POISON).put(PokemonType.FAIRY, RESISTANT);
        singleTypeResistance.get(PokemonType.POISON).put(PokemonType.FIGHTING, RESISTANT);
        singleTypeResistance.get(PokemonType.POISON).put(PokemonType.GRASS, RESISTANT);
        singleTypeResistance.get(PokemonType.POISON).put(PokemonType.POISON, RESISTANT);
        singleTypeResistance.get(PokemonType.POISON).put(PokemonType.GROUND, VULNERABLE);
        singleTypeResistance.get(PokemonType.POISON).put(PokemonType.PSYCHIC, VULNERABLE);
        
        singleTypeResistance.put(PokemonType.GROUND, new HashMap<>());
        singleTypeResistance.get(PokemonType.GROUND).put(PokemonType.ELECTRIC, DOUBLE_RESISTANT);
        singleTypeResistance.get(PokemonType.GROUND).put(PokemonType.POISON, RESISTANT);
        singleTypeResistance.get(PokemonType.GROUND).put(PokemonType.ROCK, RESISTANT);
        singleTypeResistance.get(PokemonType.GROUND).put(PokemonType.GRASS, VULNERABLE);
        singleTypeResistance.get(PokemonType.GROUND).put(PokemonType.ICE, VULNERABLE);
        singleTypeResistance.get(PokemonType.GROUND).put(PokemonType.WATER, VULNERABLE);
        
        singleTypeResistance.put(PokemonType.FLYING, new HashMap<>());
        singleTypeResistance.get(PokemonType.FLYING).put(PokemonType.GROUND, DOUBLE_RESISTANT);
        singleTypeResistance.get(PokemonType.FLYING).put(PokemonType.BUG, RESISTANT);
        singleTypeResistance.get(PokemonType.FLYING).put(PokemonType.FIGHTING, RESISTANT);
        singleTypeResistance.get(PokemonType.FLYING).put(PokemonType.GRASS, RESISTANT);
        singleTypeResistance.get(PokemonType.FLYING).put(PokemonType.ELECTRIC, VULNERABLE);
        singleTypeResistance.get(PokemonType.FLYING).put(PokemonType.ICE, VULNERABLE);
        singleTypeResistance.get(PokemonType.FLYING).put(PokemonType.ROCK, VULNERABLE);
        
        singleTypeResistance.put(PokemonType.PSYCHIC, new HashMap<>());
        singleTypeResistance.get(PokemonType.PSYCHIC).put(PokemonType.FIGHTING, RESISTANT);
        singleTypeResistance.get(PokemonType.PSYCHIC).put(PokemonType.PSYCHIC, RESISTANT);
        singleTypeResistance.get(PokemonType.PSYCHIC).put(PokemonType.BUG, VULNERABLE);
        singleTypeResistance.get(PokemonType.PSYCHIC).put(PokemonType.DARK, VULNERABLE);
        singleTypeResistance.get(PokemonType.PSYCHIC).put(PokemonType.GHOST, VULNERABLE);
        
        singleTypeResistance.put(PokemonType.BUG, new HashMap<>());
        singleTypeResistance.get(PokemonType.BUG).put(PokemonType.FIGHTING, RESISTANT);
        singleTypeResistance.get(PokemonType.BUG).put(PokemonType.GRASS, RESISTANT);
        singleTypeResistance.get(PokemonType.BUG).put(PokemonType.GROUND, RESISTANT);
        singleTypeResistance.get(PokemonType.BUG).put(PokemonType.FIRE, VULNERABLE);
        singleTypeResistance.get(PokemonType.BUG).put(PokemonType.FLYING, VULNERABLE);
        singleTypeResistance.get(PokemonType.BUG).put(PokemonType.ROCK, VULNERABLE);
        
        singleTypeResistance.put(PokemonType.ROCK, new HashMap<>());
        singleTypeResistance.get(PokemonType.ROCK).put(PokemonType.FIRE, RESISTANT);
        singleTypeResistance.get(PokemonType.ROCK).put(PokemonType.FLYING, RESISTANT);
        singleTypeResistance.get(PokemonType.ROCK).put(PokemonType.NORMAL, RESISTANT);
        singleTypeResistance.get(PokemonType.ROCK).put(PokemonType.POISON, RESISTANT);
        singleTypeResistance.get(PokemonType.ROCK).put(PokemonType.FIGHTING, VULNERABLE);
        singleTypeResistance.get(PokemonType.ROCK).put(PokemonType.GRASS, VULNERABLE);
        singleTypeResistance.get(PokemonType.ROCK).put(PokemonType.GROUND, VULNERABLE);
        singleTypeResistance.get(PokemonType.ROCK).put(PokemonType.STEEL, VULNERABLE);
        singleTypeResistance.get(PokemonType.ROCK).put(PokemonType.WATER, VULNERABLE);
        
        // TODO
        singleTypeResistance.put(PokemonType.GHOST, new HashMap<>());
        singleTypeResistance.get(PokemonType.GHOST).put(PokemonType.NORMAL, NORMAL);
        singleTypeResistance.get(PokemonType.GHOST).put(PokemonType.FIRE, NORMAL);
        singleTypeResistance.get(PokemonType.GHOST).put(PokemonType.WATER, NORMAL);
        singleTypeResistance.get(PokemonType.GHOST).put(PokemonType.ELECTRIC, NORMAL);
        singleTypeResistance.get(PokemonType.GHOST).put(PokemonType.GRASS, NORMAL);
        singleTypeResistance.get(PokemonType.GHOST).put(PokemonType.ICE, NORMAL);
        singleTypeResistance.get(PokemonType.GHOST).put(PokemonType.FIGHTING, NORMAL);
        singleTypeResistance.get(PokemonType.GHOST).put(PokemonType.POISON, NORMAL);
        singleTypeResistance.get(PokemonType.GHOST).put(PokemonType.GROUND, NORMAL);
        singleTypeResistance.get(PokemonType.GHOST).put(PokemonType.FLYING, NORMAL);
        singleTypeResistance.get(PokemonType.GHOST).put(PokemonType.BUG, NORMAL);
        singleTypeResistance.get(PokemonType.GHOST).put(PokemonType.ROCK, NORMAL);
        singleTypeResistance.get(PokemonType.GHOST).put(PokemonType.GHOST, NORMAL);
        singleTypeResistance.get(PokemonType.GHOST).put(PokemonType.DRAGON, NORMAL);
        singleTypeResistance.get(PokemonType.GHOST).put(PokemonType.DARK, NORMAL);
        singleTypeResistance.get(PokemonType.GHOST).put(PokemonType.STEEL, NORMAL);
        singleTypeResistance.get(PokemonType.GHOST).put(PokemonType.FAIRY, NORMAL);
        
        singleTypeResistance.put(PokemonType.DRAGON, new HashMap<>());
        singleTypeResistance.get(PokemonType.DRAGON).put(PokemonType.NORMAL, NORMAL);
        singleTypeResistance.get(PokemonType.DRAGON).put(PokemonType.FIRE, NORMAL);
        singleTypeResistance.get(PokemonType.DRAGON).put(PokemonType.WATER, NORMAL);
        singleTypeResistance.get(PokemonType.DRAGON).put(PokemonType.ELECTRIC, NORMAL);
        singleTypeResistance.get(PokemonType.DRAGON).put(PokemonType.GRASS, NORMAL);
        singleTypeResistance.get(PokemonType.DRAGON).put(PokemonType.ICE, NORMAL);
        singleTypeResistance.get(PokemonType.DRAGON).put(PokemonType.FIGHTING, NORMAL);
        singleTypeResistance.get(PokemonType.DRAGON).put(PokemonType.POISON, NORMAL);
        singleTypeResistance.get(PokemonType.DRAGON).put(PokemonType.GROUND, NORMAL);
        singleTypeResistance.get(PokemonType.DRAGON).put(PokemonType.FLYING, NORMAL);
        singleTypeResistance.get(PokemonType.DRAGON).put(PokemonType.BUG, NORMAL);
        singleTypeResistance.get(PokemonType.DRAGON).put(PokemonType.ROCK, NORMAL);
        singleTypeResistance.get(PokemonType.DRAGON).put(PokemonType.GHOST, NORMAL);
        singleTypeResistance.get(PokemonType.DRAGON).put(PokemonType.DRAGON, NORMAL);
        singleTypeResistance.get(PokemonType.DRAGON).put(PokemonType.DARK, NORMAL);
        singleTypeResistance.get(PokemonType.DRAGON).put(PokemonType.STEEL, NORMAL);
        singleTypeResistance.get(PokemonType.DRAGON).put(PokemonType.FAIRY, NORMAL);
        
        singleTypeResistance.put(PokemonType.DARK, new HashMap<>());
        singleTypeResistance.get(PokemonType.DARK).put(PokemonType.NORMAL, NORMAL);
        singleTypeResistance.get(PokemonType.DARK).put(PokemonType.FIRE, NORMAL);
        singleTypeResistance.get(PokemonType.DARK).put(PokemonType.WATER, NORMAL);
        singleTypeResistance.get(PokemonType.DARK).put(PokemonType.ELECTRIC, NORMAL);
        singleTypeResistance.get(PokemonType.DARK).put(PokemonType.GRASS, NORMAL);
        singleTypeResistance.get(PokemonType.DARK).put(PokemonType.ICE, NORMAL);
        singleTypeResistance.get(PokemonType.DARK).put(PokemonType.FIGHTING, VULNERABLE);
        singleTypeResistance.get(PokemonType.DARK).put(PokemonType.POISON, NORMAL);
        singleTypeResistance.get(PokemonType.DARK).put(PokemonType.GROUND, NORMAL);
        singleTypeResistance.get(PokemonType.DARK).put(PokemonType.FLYING, NORMAL);
        singleTypeResistance.get(PokemonType.DARK).put(PokemonType.BUG, VULNERABLE);
        singleTypeResistance.get(PokemonType.DARK).put(PokemonType.ROCK, NORMAL);
        singleTypeResistance.get(PokemonType.DARK).put(PokemonType.GHOST, RESISTANT);
        singleTypeResistance.get(PokemonType.DARK).put(PokemonType.DRAGON, NORMAL);
        singleTypeResistance.get(PokemonType.DARK).put(PokemonType.DARK, RESISTANT);
        singleTypeResistance.get(PokemonType.DARK).put(PokemonType.STEEL, NORMAL);
        singleTypeResistance.get(PokemonType.DARK).put(PokemonType.FAIRY, VULNERABLE);
        
        singleTypeResistance.put(PokemonType.STEEL, new HashMap<>());
        singleTypeResistance.get(PokemonType.STEEL).put(PokemonType.NORMAL, NORMAL);
        singleTypeResistance.get(PokemonType.STEEL).put(PokemonType.FIRE, NORMAL);
        singleTypeResistance.get(PokemonType.STEEL).put(PokemonType.WATER, NORMAL);
        singleTypeResistance.get(PokemonType.STEEL).put(PokemonType.ELECTRIC, NORMAL);
        singleTypeResistance.get(PokemonType.STEEL).put(PokemonType.GRASS, NORMAL);
        singleTypeResistance.get(PokemonType.STEEL).put(PokemonType.ICE, NORMAL);
        singleTypeResistance.get(PokemonType.STEEL).put(PokemonType.FIGHTING, NORMAL);
        singleTypeResistance.get(PokemonType.STEEL).put(PokemonType.POISON, NORMAL);
        singleTypeResistance.get(PokemonType.STEEL).put(PokemonType.GROUND, NORMAL);
        singleTypeResistance.get(PokemonType.STEEL).put(PokemonType.FLYING, NORMAL);
        singleTypeResistance.get(PokemonType.STEEL).put(PokemonType.BUG, NORMAL);
        singleTypeResistance.get(PokemonType.STEEL).put(PokemonType.ROCK, NORMAL);
        singleTypeResistance.get(PokemonType.STEEL).put(PokemonType.GHOST, NORMAL);
        singleTypeResistance.get(PokemonType.STEEL).put(PokemonType.DRAGON, NORMAL);
        singleTypeResistance.get(PokemonType.STEEL).put(PokemonType.DARK, NORMAL);
        singleTypeResistance.get(PokemonType.STEEL).put(PokemonType.STEEL, NORMAL);
        singleTypeResistance.get(PokemonType.STEEL).put(PokemonType.FAIRY, NORMAL);
        
        singleTypeResistance.put(PokemonType.FAIRY, new HashMap<>());
        singleTypeResistance.get(PokemonType.FAIRY).put(PokemonType.NORMAL, NORMAL);
        singleTypeResistance.get(PokemonType.FAIRY).put(PokemonType.FIRE, NORMAL);
        singleTypeResistance.get(PokemonType.FAIRY).put(PokemonType.WATER, NORMAL);
        singleTypeResistance.get(PokemonType.FAIRY).put(PokemonType.ELECTRIC, NORMAL);
        singleTypeResistance.get(PokemonType.FAIRY).put(PokemonType.GRASS, NORMAL);
        singleTypeResistance.get(PokemonType.FAIRY).put(PokemonType.ICE, NORMAL);
        singleTypeResistance.get(PokemonType.FAIRY).put(PokemonType.FIGHTING, NORMAL);
        singleTypeResistance.get(PokemonType.FAIRY).put(PokemonType.POISON, NORMAL);
        singleTypeResistance.get(PokemonType.FAIRY).put(PokemonType.GROUND, NORMAL);
        singleTypeResistance.get(PokemonType.FAIRY).put(PokemonType.FLYING, NORMAL);
        singleTypeResistance.get(PokemonType.FAIRY).put(PokemonType.BUG, NORMAL);
        singleTypeResistance.get(PokemonType.FAIRY).put(PokemonType.ROCK, NORMAL);
        singleTypeResistance.get(PokemonType.FAIRY).put(PokemonType.GHOST, NORMAL);
        singleTypeResistance.get(PokemonType.FAIRY).put(PokemonType.DRAGON, NORMAL);
        singleTypeResistance.get(PokemonType.FAIRY).put(PokemonType.DARK, NORMAL);
        singleTypeResistance.get(PokemonType.FAIRY).put(PokemonType.STEEL, NORMAL);
        singleTypeResistance.get(PokemonType.FAIRY).put(PokemonType.FAIRY, NORMAL);
    }

    public static void main(String[] args) 
    {
        System.out.println("Hello World!");
    }
}
