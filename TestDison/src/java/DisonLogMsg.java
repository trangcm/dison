/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'DisonLogMsg'
 * message type.
 */

public class DisonLogMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 37;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 146;

    /** Create a new DisonLogMsg of size 37. */
    public DisonLogMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new DisonLogMsg of the given data_length. */
    public DisonLogMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new DisonLogMsg with the given data_length
     * and base offset.
     */
    public DisonLogMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new DisonLogMsg using the given byte array
     * as backing store.
     */
    public DisonLogMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new DisonLogMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public DisonLogMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new DisonLogMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public DisonLogMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new DisonLogMsg embedded in the given message
     * at the given base offset.
     */
    public DisonLogMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new DisonLogMsg embedded in the given message
     * at the given base offset and length.
     */
    public DisonLogMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <DisonLogMsg> \n";
      try {
        s += "  [id=0x"+Long.toHexString(get_id())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [size=0x"+Long.toHexString(get_size())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [app_sent_pkts=0x"+Long.toHexString(get_app_sent_pkts())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [mana_pkts=0x"+Long.toHexString(get_mana_pkts())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [forwarding_pkts=0x"+Long.toHexString(get_forwarding_pkts())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [routing_pkts=0x"+Long.toHexString(get_routing_pkts())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [mgAddr=0x"+Long.toHexString(get_mgAddr())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [app_sent_bytes=0x"+Long.toHexString(get_app_sent_bytes())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [mana_bytes=0x"+Long.toHexString(get_mana_bytes())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [forwarding_bytes=0x"+Long.toHexString(get_forwarding_bytes())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [routing_bytes=0x"+Long.toHexString(get_routing_bytes())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: id
    //   Field type: int, unsigned
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'id' is signed (false).
     */
    public static boolean isSigned_id() {
        return false;
    }

    /**
     * Return whether the field 'id' is an array (false).
     */
    public static boolean isArray_id() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'id'
     */
    public static int offset_id() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'id'
     */
    public static int offsetBits_id() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'id'
     */
    public int get_id() {
        return (int)getUIntBEElement(offsetBits_id(), 16);
    }

    /**
     * Set the value of the field 'id'
     */
    public void set_id(int value) {
        setUIntBEElement(offsetBits_id(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'id'
     */
    public static int size_id() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'id'
     */
    public static int sizeBits_id() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: size
    //   Field type: short, unsigned
    //   Offset (bits): 16
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'size' is signed (false).
     */
    public static boolean isSigned_size() {
        return false;
    }

    /**
     * Return whether the field 'size' is an array (false).
     */
    public static boolean isArray_size() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'size'
     */
    public static int offset_size() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'size'
     */
    public static int offsetBits_size() {
        return 16;
    }

    /**
     * Return the value (as a short) of the field 'size'
     */
    public short get_size() {
        return (short)getUIntBEElement(offsetBits_size(), 8);
    }

    /**
     * Set the value of the field 'size'
     */
    public void set_size(short value) {
        setUIntBEElement(offsetBits_size(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'size'
     */
    public static int size_size() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'size'
     */
    public static int sizeBits_size() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: app_sent_pkts
    //   Field type: long, unsigned
    //   Offset (bits): 24
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'app_sent_pkts' is signed (false).
     */
    public static boolean isSigned_app_sent_pkts() {
        return false;
    }

    /**
     * Return whether the field 'app_sent_pkts' is an array (false).
     */
    public static boolean isArray_app_sent_pkts() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'app_sent_pkts'
     */
    public static int offset_app_sent_pkts() {
        return (24 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'app_sent_pkts'
     */
    public static int offsetBits_app_sent_pkts() {
        return 24;
    }

    /**
     * Return the value (as a long) of the field 'app_sent_pkts'
     */
    public long get_app_sent_pkts() {
        return (long)getUIntBEElement(offsetBits_app_sent_pkts(), 32);
    }

    /**
     * Set the value of the field 'app_sent_pkts'
     */
    public void set_app_sent_pkts(long value) {
        setUIntBEElement(offsetBits_app_sent_pkts(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'app_sent_pkts'
     */
    public static int size_app_sent_pkts() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'app_sent_pkts'
     */
    public static int sizeBits_app_sent_pkts() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: mana_pkts
    //   Field type: long, unsigned
    //   Offset (bits): 56
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'mana_pkts' is signed (false).
     */
    public static boolean isSigned_mana_pkts() {
        return false;
    }

    /**
     * Return whether the field 'mana_pkts' is an array (false).
     */
    public static boolean isArray_mana_pkts() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'mana_pkts'
     */
    public static int offset_mana_pkts() {
        return (56 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'mana_pkts'
     */
    public static int offsetBits_mana_pkts() {
        return 56;
    }

    /**
     * Return the value (as a long) of the field 'mana_pkts'
     */
    public long get_mana_pkts() {
        return (long)getUIntBEElement(offsetBits_mana_pkts(), 32);
    }

    /**
     * Set the value of the field 'mana_pkts'
     */
    public void set_mana_pkts(long value) {
        setUIntBEElement(offsetBits_mana_pkts(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'mana_pkts'
     */
    public static int size_mana_pkts() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'mana_pkts'
     */
    public static int sizeBits_mana_pkts() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: forwarding_pkts
    //   Field type: long, unsigned
    //   Offset (bits): 88
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'forwarding_pkts' is signed (false).
     */
    public static boolean isSigned_forwarding_pkts() {
        return false;
    }

    /**
     * Return whether the field 'forwarding_pkts' is an array (false).
     */
    public static boolean isArray_forwarding_pkts() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'forwarding_pkts'
     */
    public static int offset_forwarding_pkts() {
        return (88 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'forwarding_pkts'
     */
    public static int offsetBits_forwarding_pkts() {
        return 88;
    }

    /**
     * Return the value (as a long) of the field 'forwarding_pkts'
     */
    public long get_forwarding_pkts() {
        return (long)getUIntBEElement(offsetBits_forwarding_pkts(), 32);
    }

    /**
     * Set the value of the field 'forwarding_pkts'
     */
    public void set_forwarding_pkts(long value) {
        setUIntBEElement(offsetBits_forwarding_pkts(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'forwarding_pkts'
     */
    public static int size_forwarding_pkts() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'forwarding_pkts'
     */
    public static int sizeBits_forwarding_pkts() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: routing_pkts
    //   Field type: long, unsigned
    //   Offset (bits): 120
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'routing_pkts' is signed (false).
     */
    public static boolean isSigned_routing_pkts() {
        return false;
    }

    /**
     * Return whether the field 'routing_pkts' is an array (false).
     */
    public static boolean isArray_routing_pkts() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'routing_pkts'
     */
    public static int offset_routing_pkts() {
        return (120 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'routing_pkts'
     */
    public static int offsetBits_routing_pkts() {
        return 120;
    }

    /**
     * Return the value (as a long) of the field 'routing_pkts'
     */
    public long get_routing_pkts() {
        return (long)getUIntBEElement(offsetBits_routing_pkts(), 32);
    }

    /**
     * Set the value of the field 'routing_pkts'
     */
    public void set_routing_pkts(long value) {
        setUIntBEElement(offsetBits_routing_pkts(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'routing_pkts'
     */
    public static int size_routing_pkts() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'routing_pkts'
     */
    public static int sizeBits_routing_pkts() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: mgAddr
    //   Field type: int, unsigned
    //   Offset (bits): 152
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'mgAddr' is signed (false).
     */
    public static boolean isSigned_mgAddr() {
        return false;
    }

    /**
     * Return whether the field 'mgAddr' is an array (false).
     */
    public static boolean isArray_mgAddr() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'mgAddr'
     */
    public static int offset_mgAddr() {
        return (152 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'mgAddr'
     */
    public static int offsetBits_mgAddr() {
        return 152;
    }

    /**
     * Return the value (as a int) of the field 'mgAddr'
     */
    public int get_mgAddr() {
        return (int)getUIntBEElement(offsetBits_mgAddr(), 16);
    }

    /**
     * Set the value of the field 'mgAddr'
     */
    public void set_mgAddr(int value) {
        setUIntBEElement(offsetBits_mgAddr(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'mgAddr'
     */
    public static int size_mgAddr() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'mgAddr'
     */
    public static int sizeBits_mgAddr() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: app_sent_bytes
    //   Field type: long, unsigned
    //   Offset (bits): 168
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'app_sent_bytes' is signed (false).
     */
    public static boolean isSigned_app_sent_bytes() {
        return false;
    }

    /**
     * Return whether the field 'app_sent_bytes' is an array (false).
     */
    public static boolean isArray_app_sent_bytes() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'app_sent_bytes'
     */
    public static int offset_app_sent_bytes() {
        return (168 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'app_sent_bytes'
     */
    public static int offsetBits_app_sent_bytes() {
        return 168;
    }

    /**
     * Return the value (as a long) of the field 'app_sent_bytes'
     */
    public long get_app_sent_bytes() {
        return (long)getUIntBEElement(offsetBits_app_sent_bytes(), 32);
    }

    /**
     * Set the value of the field 'app_sent_bytes'
     */
    public void set_app_sent_bytes(long value) {
        setUIntBEElement(offsetBits_app_sent_bytes(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'app_sent_bytes'
     */
    public static int size_app_sent_bytes() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'app_sent_bytes'
     */
    public static int sizeBits_app_sent_bytes() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: mana_bytes
    //   Field type: long, unsigned
    //   Offset (bits): 200
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'mana_bytes' is signed (false).
     */
    public static boolean isSigned_mana_bytes() {
        return false;
    }

    /**
     * Return whether the field 'mana_bytes' is an array (false).
     */
    public static boolean isArray_mana_bytes() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'mana_bytes'
     */
    public static int offset_mana_bytes() {
        return (200 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'mana_bytes'
     */
    public static int offsetBits_mana_bytes() {
        return 200;
    }

    /**
     * Return the value (as a long) of the field 'mana_bytes'
     */
    public long get_mana_bytes() {
        return (long)getUIntBEElement(offsetBits_mana_bytes(), 32);
    }

    /**
     * Set the value of the field 'mana_bytes'
     */
    public void set_mana_bytes(long value) {
        setUIntBEElement(offsetBits_mana_bytes(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'mana_bytes'
     */
    public static int size_mana_bytes() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'mana_bytes'
     */
    public static int sizeBits_mana_bytes() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: forwarding_bytes
    //   Field type: long, unsigned
    //   Offset (bits): 232
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'forwarding_bytes' is signed (false).
     */
    public static boolean isSigned_forwarding_bytes() {
        return false;
    }

    /**
     * Return whether the field 'forwarding_bytes' is an array (false).
     */
    public static boolean isArray_forwarding_bytes() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'forwarding_bytes'
     */
    public static int offset_forwarding_bytes() {
        return (232 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'forwarding_bytes'
     */
    public static int offsetBits_forwarding_bytes() {
        return 232;
    }

    /**
     * Return the value (as a long) of the field 'forwarding_bytes'
     */
    public long get_forwarding_bytes() {
        return (long)getUIntBEElement(offsetBits_forwarding_bytes(), 32);
    }

    /**
     * Set the value of the field 'forwarding_bytes'
     */
    public void set_forwarding_bytes(long value) {
        setUIntBEElement(offsetBits_forwarding_bytes(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'forwarding_bytes'
     */
    public static int size_forwarding_bytes() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'forwarding_bytes'
     */
    public static int sizeBits_forwarding_bytes() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: routing_bytes
    //   Field type: long, unsigned
    //   Offset (bits): 264
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'routing_bytes' is signed (false).
     */
    public static boolean isSigned_routing_bytes() {
        return false;
    }

    /**
     * Return whether the field 'routing_bytes' is an array (false).
     */
    public static boolean isArray_routing_bytes() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'routing_bytes'
     */
    public static int offset_routing_bytes() {
        return (264 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'routing_bytes'
     */
    public static int offsetBits_routing_bytes() {
        return 264;
    }

    /**
     * Return the value (as a long) of the field 'routing_bytes'
     */
    public long get_routing_bytes() {
        return (long)getUIntBEElement(offsetBits_routing_bytes(), 32);
    }

    /**
     * Set the value of the field 'routing_bytes'
     */
    public void set_routing_bytes(long value) {
        setUIntBEElement(offsetBits_routing_bytes(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'routing_bytes'
     */
    public static int size_routing_bytes() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'routing_bytes'
     */
    public static int sizeBits_routing_bytes() {
        return 32;
    }

}
