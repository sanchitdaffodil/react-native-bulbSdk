# bulbsdk

wrapper for bulb sdk

## Installation

```sh
npm install bulbsdk
```

## Usage

```js
import { authenticate, open } from "bulbsdk";

// ...

const result = await authenticate("useremail", "password");


// ... To open the sdk after authentication
open();
```

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT
