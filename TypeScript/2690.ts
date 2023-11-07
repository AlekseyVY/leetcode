// Problem: https://leetcode.com/problems/infinite-method-object/description/

function createInfiniteObject(): Record<string, () => string> {
	return new Proxy({}, {
        get: function(_, property) {
            return () => {
                return property
            }
        }
    })
};

/**
 * const obj = createInfiniteObject();
 * obj['abc123'](); // "abc123"
 */
