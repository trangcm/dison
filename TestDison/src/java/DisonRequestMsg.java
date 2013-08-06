/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'DisonRequestMsg'
 * message type.
 */

public class DisonRequestMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 24;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 145;

    /** Create a new DisonRequestMsg of size 24. */
    public DisonRequestMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new DisonRequestMsg of the given data_length. */
    public DisonRequestMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new DisonRequestMsg with the given data_length
     * and base offset.
     */
    public DisonRequestMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new DisonRequestMsg using the given byte array
     * as backing store.
     */
    public DisonRequestMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new DisonRequestMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public DisonRequestMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new DisonRequestMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public DisonRequestMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new DisonRequestMsg embedded in the given message
     * at the given base offset.
     */
    public DisonRequestMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new DisonRequestMsg embedded in the given message
     * at the given base offset and length.
     */
    public DisonRequestMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <DisonRequestMsg> \n";
      try {
        s += "  [dstId=0x"+Long.toHexString(get_dstId())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [type=0x"+Long.toHexString(get_type())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [noParams=0x"+Long.toHexString(get_noParams())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [params=";
        for (int i = 0; i < 10; i++) {
          s += "0x"+Long.toHexString(getElement_params(i) & 0xffff)+" ";
        }
        s += "]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: dstId
    //   Field type: int, unsigned
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'dstId' is signed (false).
     */
    public static boolean isSigned_dstId() {
        return false;
    }

    /**
     * Return whether the field 'dstId' is an array (false).
     */
    public static boolean isArray_dstId() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'dstId'
     */
    public static int offset_dstId() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'dstId'
     */
    public static int offsetBits_dstId() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'dstId'
     */
    public int get_dstId() {
        return (int)getUIntBEElement(offsetBits_dstId(), 16);
    }

    /**
     * Set the value of the field 'dstId'
     */
    public void set_dstId(int value) {
        setUIntBEElement(offsetBits_dstId(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'dstId'
     */
    public static int size_dstId() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'dstId'
     */
    public static int sizeBits_dstId() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: type
    //   Field type: short, unsigned
    //   Offset (bits): 16
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'type' is signed (false).
     */
    public static boolean isSigned_type() {
        return false;
    }

    /**
     * Return whether the field 'type' is an array (false).
     */
    public static boolean isArray_type() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'type'
     */
    public static int offset_type() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'type'
     */
    public static int offsetBits_type() {
        return 16;
    }

    /**
     * Return the value (as a short) of the field 'type'
     */
    public short get_type() {
        return (short)getUIntBEElement(offsetBits_type(), 8);
    }

    /**
     * Set the value of the field 'type'
     */
    public void set_type(short value) {
        setUIntBEElement(offsetBits_type(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'type'
     */
    public static int size_type() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'type'
     */
    public static int sizeBits_type() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: noParams
    //   Field type: short, unsigned
    //   Offset (bits): 24
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'noParams' is signed (false).
     */
    public static boolean isSigned_noParams() {
        return false;
    }

    /**
     * Return whether the field 'noParams' is an array (false).
     */
    public static boolean isArray_noParams() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'noParams'
     */
    public static int offset_noParams() {
        return (24 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'noParams'
     */
    public static int offsetBits_noParams() {
        return 24;
    }

    /**
     * Return the value (as a short) of the field 'noParams'
     */
    public short get_noParams() {
        return (short)getUIntBEElement(offsetBits_noParams(), 8);
    }

    /**
     * Set the value of the field 'noParams'
     */
    public void set_noParams(short value) {
        setUIntBEElement(offsetBits_noParams(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'noParams'
     */
    public static int size_noParams() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'noParams'
     */
    public static int sizeBits_noParams() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: params
    //   Field type: int[], unsigned
    //   Offset (bits): 32
    //   Size of each element (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'params' is signed (false).
     */
    public static boolean isSigned_params() {
        return false;
    }

    /**
     * Return whether the field 'params' is an array (true).
     */
    public static boolean isArray_params() {
        return true;
    }

    /**
     * Return the offset (in bytes) of the field 'params'
     */
    public static int offset_params(int index1) {
        int offset = 32;
        if (index1 < 0 || index1 >= 10) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 16;
        return (offset / 8);
    }

    /**
     * Return the offset (in bits) of the field 'params'
     */
    public static int offsetBits_params(int index1) {
        int offset = 32;
        if (index1 < 0 || index1 >= 10) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 16;
        return offset;
    }

    /**
     * Return the entire array 'params' as a int[]
     */
    public int[] get_params() {
        int[] tmp = new int[10];
        for (int index0 = 0; index0 < numElements_params(0); index0++) {
            tmp[index0] = getElement_params(index0);
        }
        return tmp;
    }

    /**
     * Set the contents of the array 'params' from the given int[]
     */
    public void set_params(int[] value) {
        for (int index0 = 0; index0 < value.length; index0++) {
            setElement_params(index0, value[index0]);
        }
    }

    /**
     * Return an element (as a int) of the array 'params'
     */
    public int getElement_params(int index1) {
        return (int)getUIntBEElement(offsetBits_params(index1), 16);
    }

    /**
     * Set an element of the array 'params'
     */
    public void setElement_params(int index1, int value) {
        setUIntBEElement(offsetBits_params(index1), 16, value);
    }

    /**
     * Return the total size, in bytes, of the array 'params'
     */
    public static int totalSize_params() {
        return (160 / 8);
    }

    /**
     * Return the total size, in bits, of the array 'params'
     */
    public static int totalSizeBits_params() {
        return 160;
    }

    /**
     * Return the size, in bytes, of each element of the array 'params'
     */
    public static int elementSize_params() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of each element of the array 'params'
     */
    public static int elementSizeBits_params() {
        return 16;
    }

    /**
     * Return the number of dimensions in the array 'params'
     */
    public static int numDimensions_params() {
        return 1;
    }

    /**
     * Return the number of elements in the array 'params'
     */
    public static int numElements_params() {
        return 10;
    }

    /**
     * Return the number of elements in the array 'params'
     * for the given dimension.
     */
    public static int numElements_params(int dimension) {
      int array_dims[] = { 10,  };
        if (dimension < 0 || dimension >= 1) throw new ArrayIndexOutOfBoundsException();
        if (array_dims[dimension] == 0) throw new IllegalArgumentException("Array dimension "+dimension+" has unknown size");
        return array_dims[dimension];
    }

}
