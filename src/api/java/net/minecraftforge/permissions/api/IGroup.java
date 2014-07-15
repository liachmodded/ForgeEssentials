package net.minecraftforge.permissions.api;
 
import net.minecraft.entity.player.EntityPlayer;
 
import java.util.Collection;
import java.util.UUID;
 
public interface IGroup {
 
    /**
     * Add an EntityPlayer to the group
     *
     * @param player player to add
     */
    void addPlayer(UUID playerID);
 
    /**
     * Remove an EntityPlayer from the group
     *
     * @param player player to remove
     * @return if the player was in the group
     */
    boolean removePlayer(UUID playerID);
 
    /**
     * Get all players in the group
     *
     * @return A list containing UUIDs of all players in the group
     */
    Collection<UUID> getAllPlayers();
    
    /**
     * Is the player in the group
     * 
     * @param playerID player to check
     * @return if the player was in the group
     */
    boolean isMember(UUID playerID);
    
    /**
     * Get the parent of the group
     * 
     * @return parent of group
     */
    IGroup getParent();
    
    /**
     * Set the parent of the group
     * 
     * @param parent the parent group
     * @return 
     */
    IGroup setParent(IGroup parent);
 
    /**
     * Get the group name
     *
     * @return the group name
     */
    String getName();
 
    /**
     * Set the group name
     *
     * @param name new group name
     */
    void setName(String name);
}