import { NativeModules, Platform } from 'react-native';
import Colors from './colors';
const LINKING_ERROR =
  `The package 'bulbsdk' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo managed workflow\n';

const Bulbsdk = NativeModules.Bulbsdk
  ? NativeModules.Bulbsdk
  : new Proxy(
      {},
      {
        get() {
          throw new Error(LINKING_ERROR);
        },
      }
    );

export function multiply(a: number, b: number): Promise<number> {
  return Bulbsdk.multiply(a, b);
}
export function authenticate(email: string, password: string): Promise<number> {
  return Bulbsdk.authenticate(email, password);
}
export function open() {
  return Bulbsdk.open();
}

export function callBriefIntro(briefRef: string) {
  return Bulbsdk.callBriefIntro(briefRef);
}

export function callFeedScreen() {
  return Bulbsdk.callFeedScreen();
}

export function callBriefSurvey(briefRef: string) {
  return Bulbsdk.callBriefSurvey(briefRef);
}

export function callCreateBulbShare(briefRef: string) {
  return Bulbsdk.callCreateBulbShare(briefRef);
}

export function callMyProfile() {
  return Bulbsdk.callMyProfile();
}

export function configSdk(data: any) {
  return Bulbsdk.configSdk(
    data?.primaryThemeColor || '',
    data?.secThemeColor || '',
    data?.profileTabColor || '',
    data?.googleKey || '',
    data?.fbKey || '',
    data?.twitterKey || '',
    data?.twitterSecret || '',
    data?.WlaId || ''
  );
}

export const BulbShareColours = Colors;
