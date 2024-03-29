package model.items;

import model.units.IUnit;

/**
 * Abstract class that defines some common information and behaviour between all items.
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public abstract class AbstractItem implements IEquipableItem {

  private final String name;
  private final int power;
  protected int maxRange;
  protected int minRange;
  private IUnit owner;

  /**
   * Constructor for a default item without any special behaviour.
   *
   * @param name     the name of the item
   * @param power    the power of the item (this could be the amount of damage or healing the item does)
   * @param minRange the minimum range of the item
   * @param maxRange the maximum range of the item
   */
  protected AbstractItem(final String name, final int power, final int minRange, final int maxRange) {
    this.name = name;
    this.power = Math.max(power, 0);
    this.minRange = Math.max(minRange, 1);
    this.maxRange = Math.max(maxRange, this.minRange);
  }

  @Override
  public void setOwner(final IUnit unit) {
    owner = unit;
  }

  @Override
  public IUnit getOwner() {
    return owner;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getPower() {
    return power;
  }

  @Override
  public int getMinRange() {
    return minRange;
  }

  @Override
  public int getMaxRange() {
    return maxRange;
  }

  @Override
  public abstract void useOn(IUnit target);

  /**
   * Default behavior for non-magic items
   * <p>
   * Default non-magic items will receive normal damage.
   *
   * @param item item which will receive the attack
   */
  @Override
  public void receiveAxeDamage(IEquipableItem item) {
    getOwner().receiveNormalDamage(item);
  }

  /**
   * Default behavior for non-magic items
   * <p>
   * Default non-magic items will receive normal damage.
   *
   * @param item item which will receive the attack
   */
  @Override
  public void receiveBowDamage(IEquipableItem item) {
    getOwner().receiveNormalDamage(item);
  }

  /**
   * Default behavior for non-magic items
   * <p>
   * Default non-magic items will receive normal damage.
   *
   * @param item item which will receive the attack
   */
  @Override
  public void receiveSpearDamage(IEquipableItem item) {
    getOwner().receiveNormalDamage(item);
  }

  /**
   * Default behavior for non-magic items
   * <p>
   * Default non-magic items will receive normal healing.
   *
   * @param item item which will receive the healing
   */
  @Override
  public void receiveStaffHealing(IEquipableItem item) {
    getOwner().receiveNormalHeal(item);
  }

  /**
   * Default behavior for non-magic items
   * <p>
   * Default non-magic items will receive normal damage.
   *
   * @param item item which will receive the attack
   */
  @Override
  public void receiveSwordDamage(IEquipableItem item) {
    getOwner().receiveNormalDamage(item);
  }

  /**
   * Default behavior for non-magic items
   * <p>
   * All non-magic items will receive increased damage from magic books.
   *
   * @param item item which will receive the attack
   */
  @Override
  public void receiveDarkMagicBookDamage(IEquipableItem item) {
    getOwner().receiveIncreasedDamage(item);
  }

  /**
   * Default behavior for non-magic items
   * <p>
   * All non-magic items will receive increased damage from magic books.
   *
   * @param item item which will receive the attack
   */
  @Override
  public void receiveLightMagicBookDamage(IEquipableItem item) {
    getOwner().receiveIncreasedDamage(item);
  }

  /**
   * Default behavior for non-magic items
   * <p>
   * All non-magic items will receive increased damage from magic books.
   *
   * @param item item which will receive the attack
   */
  @Override
  public void receiveSoulMagicBookDamage(IEquipableItem item) {
    getOwner().receiveIncreasedDamage(item);
  }
}
