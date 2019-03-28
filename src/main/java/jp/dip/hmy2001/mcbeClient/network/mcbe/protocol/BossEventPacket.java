package jp.dip.hmy2001.mcbeClient.network.mcbe.protocol;

import jp.dip.hmy2001.mcbeClient.network.mcbe.GamePacket;

public class BossEventPacket extends GamePacket {

    public int bossEntityUniqueId;
    public int eventType;

    public byte getPacketId() {
        return ProtocolInfo.BOSS_EVENT_PACKET;
    }

    public void decodeBody(){
        bossEntityUniqueId = readVarLong();
        eventType = readUnsignedVarInt();
        /*switch (eventType){
            case 0:

            break;
        }*/
    }

}
