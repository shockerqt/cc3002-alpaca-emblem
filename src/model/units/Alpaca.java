package model.units;

import model.items.IEquipableItem;
import model.map.Location;

/**
 * This class represents an <i>Alpaca</i> type unit.
 * <p>
 * This are a special kind of unit that can carry an unlimited amount of items but can't use any of
 * them.
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public class Alpaca extends AbstractUnit {

  /**
   * Creates a new alpaca.
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
  public Alpaca(final int maxHitPoints, final int movement, final Location location,
      final IEquipableItem... items) {
    super(maxHitPoints, movement, location, Integer.MAX_VALUE, items);
  }
}
