# Alpaca Emblem
## Units
The game have 7 types of units:
### Alpaca
* Can't equip objects but can carry an unlimited amount of them on the inventory.

## Roles
Roles are an implementation to manage and group units by their function ingame. Roles are used as properties for units, have a getter and setter. The role is automatically updated when a unit equip or unequip an item.
### Damage Dealer
A unit gets the role "Damage Dealer" when equips any of the following items: axe, bow, magic books, spear, sword. 
This role let the unit attack when the method combat is called or counter attack when another unit attack this in combat.
If the attack is successful, if the target have a "Damage Dealer" role, it will counter attack the unit.

### Support
When a unit equip a staff, gets the role "Support". When a support unit enter in combat, heals the targetted unit and don't receive a counter attack from the target. If a "Support" unit gets attacked in a combat by a "Damage Dealer" unit, the "Support" unit can't counter attack.

### NoRole
Units which don't have any equipped item receive the role "NoRole". A "NoRole" unit can't enter in combat or counter attack, but can be targeted of combats by "Support" units or "Damage Dealer" units.

## Equip Items
A unit can equip an item calling the method "equipItem(IEquipableItem item)". The items must be on the unit items list (inventory) to get equipped. When a unit equip an item, the item makes the unit the owner of this. To disambiguate the type of the item a layer of "Double Dispatch" was applied, letting the item decide itself on with type of unit can be equipped.

## Combat
To execute a combat we need to call the method "combat(IUnit target)" from a unit, this method call the method with the same name in the Role object from the unit. The combat behavior depends on the role that the unit had at the moment of the call. The combat method check if the unit weapon have the range to reach the target unit, if not the combat will finalize without executing a counter attack from the target. The combat method uses a layer of Double Dispatch to disambiguate the type of item.

## Trade