/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * See {@link VkPhysicalDeviceIDProperties}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceIDPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint8_t deviceUUID[VK_UUID_SIZE];
 *     uint8_t driverUUID[VK_UUID_SIZE];
 *     uint8_t deviceLUID[VK_LUID_SIZE];
 *     uint32_t deviceNodeMask;
 *     VkBool32 deviceLUIDValid;
 * }</code></pre>
 */
public class VkPhysicalDeviceIDPropertiesKHR extends VkPhysicalDeviceIDProperties {

    /**
     * Creates a {@code VkPhysicalDeviceIDPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceIDPropertiesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceIDPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceIDPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceIDPropertiesKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceIDPropertiesKHR set(VkPhysicalDeviceIDPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceIDPropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceIDPropertiesKHR create(long address) {
        return wrap(VkPhysicalDeviceIDPropertiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceIDPropertiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceIDPropertiesKHR.class, address);
    }

    /**
     * Create a {@link VkPhysicalDeviceIDPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIDPropertiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceIDPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceIDPropertiesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceIDProperties.Buffer {

        private static final VkPhysicalDeviceIDPropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceIDPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceIDPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceIDPropertiesKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkPhysicalDeviceIDPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceIDPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceIDPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceIDPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceIDPropertiesKHR.npNext(address(), value); return this; }

    }

}