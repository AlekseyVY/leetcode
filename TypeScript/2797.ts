// Problem: https://leetcode.com/problems/partial-function-with-placeholders/description/

type JSONValue = null | boolean | number | string | JSONValue[] | { [key: string]: JSONValue };
type Fn = (...args: JSONValue[]) => JSONValue

function partial(fn: Fn, args: JSONValue[]): Fn {

	return function(...restArgs) {
        let idx = 0;
		const mappedArgs = args.map((arg) => {
            if(arg === "_") return restArgs[idx++]
            return arg;
        });
        return fn(...mappedArgs, ...restArgs.slice(idx))
    }
};
