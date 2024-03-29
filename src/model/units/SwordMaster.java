package model.units;

import model.items.IEquipableItem;
import model.items.Sword;
import model.map.Location;
import model.roles.DamageDealer;

/**
 * This class represents a <i>SwordMaster</i> type unit.
 * <p>
 * A <i>SwordMaster</i> is a unit that <b>can only use sword type weapons</b>.
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public class SwordMaster extends AbstractUnit {

  /**
   * Creates a new swordmaster.
   *
   * @param maxHitPoints
   *     maximum hit points of the unit
   * @param movement
   *     the amount of cells this unit can move
   * @param location
   *     the initial position of this unit
   * @param items
   *     the items carried by this unit
   */
  public SwordMaster(final int maxHitPoints, final int movement, final Location location,
      IEquipableItem... items) {
    super(maxHitPoints, movement, location, 3, items);
  }

  @Override
  public void equipSword(final Sword sword) {
    setEquippedItem(sword);
    setRole(new DamageDealer());
  }
}
