
#import <Foundation/Foundation.h>

#define kAES256CryptoErrorDomain @"AES256CryptoErrorDomain"
#define kAES256CryptoUserInfoErrorStatus @"CCCryptorStatus"

@interface NSData (Encryption)

/**
 * Method to AES256 encrypt the data with the specified key .
 *
 * @param key The key to use to encrypt the data - only up to the first kCCKeySizeAES256 characters are used.
 * @return The encrypted data if successful, otherwise nil.
 *
 * @note This method is intended for use with small NSData (less than tens of MBs).
 */
- (NSData *)aes256EncryptWithKey:(NSString*)key  error: (NSError **)error;

/**
 * Method to AES256 decrypt the encrypted data with the specified key.
 *
 * @param key The key to use to decrypt the data - only up to the first kCCKeySizeAES256 characters are used.
 *
 * @return The decrypted data if successful, otherwise nil.
 *
 * @note This method is intended for use with small NSData (less than tens of MBs).
 */
- (NSData *)aes256DecryptWithKey:(NSString*)key  error: (NSError **)error;

@end
