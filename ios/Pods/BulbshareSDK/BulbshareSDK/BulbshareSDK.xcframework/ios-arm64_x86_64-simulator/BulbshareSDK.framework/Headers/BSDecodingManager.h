#import <Foundation/Foundation.h>

@interface BSDecodingManager : NSObject{}

- (NSString*)hashedSha256ValueWithSecret:(NSString*)key andData:(NSString*)data;
- (NSString*)randomStringWithLength:(int)len;
- (NSString*)hashedMD5VauleWithString:(NSString*)data;

@end
