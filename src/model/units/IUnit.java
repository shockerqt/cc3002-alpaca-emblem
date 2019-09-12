package model.units;

import java.util.List;

import model.items.*;
import model.map.Location;
import model.roles.Role;

/**
 * This interface represents all units in the game.
 * <p>
 * The signature of all the common methods that a unit can execute are defined here. All units
 * except some special ones can carry at most 3 weapons.
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public interface IUnit {

  /**
   * Sets the currently equipped item of this unit.
   *
   * @param item
   *     the item to equip
   */
  void equipItem(IEquipableItem item);

  /**
   * @return hit points of the unit
   */
  int getHitPoints();

  /**
   * @return the items carried by this unit
   */
  List<IEquipableItem> getItems();

  /**
   * @return the currently equipped item
   */
  IEquipableItem getEquippedItem();

  /**
   * @param item
   *     the item to be equipped
   */
  void setEquippedItem(IEquipableItem item);

  /**
   * @return the current location of the unit
   */
  Location getLocation();

  /**
   * Sets a new location for this unit,
   */
  void setLocation(final Location location);

  /**
   * @return the number of cells this unit can move
   */
  int getMovement();

  /**
   * Moves this unit to another location.
   * <p>
   * If the other location is out of this unit's movement range, the unit doesn't move.
   */
  void moveTo(Location targetLocation);

  /**
   * Equip a bow to this unit.
   */
  void equipBow(final Bow bow);

  /**
   * Equip an axe to this unit.
   */
  void equipAxe(final Axe axe);

  /**
   * Equip a spear to this unit.
   */
  void equipSpear(final Spear spear);

  /**
   * Equip a staff to this unit.
   */
  void equipStaff(final Staff staff);

  /**
   * Equip a sword to this unit.
   */
  void equipSword(final Sword sword);

  /**
   * Equip a magic book to this unit
   */
  void equipMagicBook(final MagicBook MagicBook);

  /**
   * @return the current role of the unit
   */
  Role getRole();

  /**
   * @param role the new role of the unit
   */
  void setRole(Role role);

  void combat(IUnit unit);

  void useItem(IUnit target);

  void receiveNormalDamage(IEquipableItem item);

  void receiveNormalHeal(IEquipableItem item);

  void receiveIncreasedDamage(IEquipableItem item);

  void receiveReducedDamage(IEquipableItem item);
}
