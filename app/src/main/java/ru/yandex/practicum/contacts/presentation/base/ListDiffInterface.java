package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
     boolean theSameAs(T testIt);
     boolean equals(Object anotherItem);
}
