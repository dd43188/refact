package com.water.method;

public class ComposedMethod {
    private Object[] elements = new Object[10];
    private int size = 0;
    private boolean readOnly = false;

    public void add(Object element) {
        if (!readOnly) {
            int newSize = size + 1;
            if (newSize > elements.length) {
                Object[] newElements = new Object[elements.length + 10];

                for (int i = 0; i < size; i++) {
                    newElements[i] = elements[i];
                }
                elements = newElements;
            }

            elements[size++] = element;
        }
    }
}
