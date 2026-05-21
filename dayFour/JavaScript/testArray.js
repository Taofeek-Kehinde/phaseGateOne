testListNumber('TestListNumber', () => {
    test('that the first result is true', () => {
        const result = listNumber([8, 6, 12, 4, -2], 6);
        assert.Equal(result, [8, -2]);
    });

    test('that the second result is true', () => {
        const result = listNumber([1, 2, 5, 7, 6, 8, 9], 12);
        assert.Equals(result, [5, 7]);
    });
});

