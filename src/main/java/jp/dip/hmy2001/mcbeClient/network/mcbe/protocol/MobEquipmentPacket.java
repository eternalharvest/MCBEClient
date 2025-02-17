package jp.dip.hmy2001.mcbeClient.network.mcbe.protocol;

import jp.dip.hmy2001.mcbeClient.network.mcbe.GamePacket;

public class MobEquipmentPacket extends GamePacket {

    public int entityRuntimeId;
    public int inventorySlot;
    public int hotbarSlot;
    public int windowId;

    public byte getPacketId() {
        return ProtocolInfo.MOB_EQUIPMENT_PACKET;
    }

    public void encodeBody(){

    }

    public void decodeBody(){
        entityRuntimeId = readUnsignedVarLong();
        readSlot();
        inventorySlot = readByte();
        hotbarSlot = readByte();
        windowId = readByte();
    }

}
